/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyExchangeDetails;
import com.tools20022.repository.msg.CurrencyReferenceDetails;
import com.tools20022.repository.msg.ErrorHandling3;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on currency exchange information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2#CurrencyExchangeInformationOrBusinessErrorRule
 * CurrencyExchangeReport2.CurrencyExchangeInformationOrBusinessErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2#mmCurrencyReference
 * CurrencyExchangeReport2.mmCurrencyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2#mmBusinessError
 * CurrencyExchangeReport2.mmBusinessError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2#mmCurrencyExchangeInformation
 * CurrencyExchangeReport2.mmCurrencyExchangeInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyExchangeReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on currency exchange information or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyExchangeReport2", propOrder = {"currencyReference", "businessError", "currencyExchangeInformation"})
public class CurrencyExchangeReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CcyRef", required = true)
	protected CurrencyReferenceDetails currencyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails
	 * CurrencyReferenceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2
	 * CurrencyExchangeReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source and target currencies for which information is request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyExchangeReport2, CurrencyReferenceDetails> mmCurrencyReference = new MMMessageAssociationEnd<CurrencyExchangeReport2, CurrencyReferenceDetails>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeReport2.mmObject();
			isDerived = false;
			xmlTag = "CcyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyReference";
			definition = "Source and target currencies for which information is request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyReferenceDetails.mmObject();
		}

		@Override
		public CurrencyReferenceDetails getValue(CurrencyExchangeReport2 obj) {
			return obj.getCurrencyReference();
		}

		@Override
		public void setValue(CurrencyExchangeReport2 obj, CurrencyReferenceDetails value) {
			obj.setCurrencyReference(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected ErrorHandling3 businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2
	 * CurrencyExchangeReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyExchangeReport2, ErrorHandling3> mmBusinessError = new MMMessageAssociationEnd<CurrencyExchangeReport2, ErrorHandling3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeReport2.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public ErrorHandling3 getValue(CurrencyExchangeReport2 obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(CurrencyExchangeReport2 obj, ErrorHandling3 value) {
			obj.setBusinessError(value);
		}
	};
	@XmlElement(name = "CcyXchgInf", required = true)
	protected CurrencyExchangeDetails currencyExchangeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails
	 * CurrencyExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2
	 * CurrencyExchangeReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchgInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested business information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyExchangeReport2, CurrencyExchangeDetails> mmCurrencyExchangeInformation = new MMMessageAssociationEnd<CurrencyExchangeReport2, CurrencyExchangeDetails>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeReport2.mmObject();
			isDerived = false;
			xmlTag = "CcyXchgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchangeInformation";
			definition = "Requested business information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyExchangeDetails.mmObject();
		}

		@Override
		public CurrencyExchangeDetails getValue(CurrencyExchangeReport2 obj) {
			return obj.getCurrencyExchangeInformation();
		}

		@Override
		public void setValue(CurrencyExchangeReport2 obj, CurrencyExchangeDetails value) {
			obj.setCurrencyExchangeInformation(value);
		}
	};
	/**
	 * Either CurrencyExchangeInformation or BusinessError must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2
	 * CurrencyExchangeReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2#mmBusinessError
	 * CurrencyExchangeReport2.mmBusinessError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2#mmCurrencyExchangeInformation
	 * CurrencyExchangeReport2.mmCurrencyExchangeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeInformationOrBusinessErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CurrencyExchangeInformation or BusinessError must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor CurrencyExchangeInformationOrBusinessErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchangeInformationOrBusinessErrorRule";
			definition = "Either CurrencyExchangeInformation or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeReport2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeReport2.mmBusinessError, com.tools20022.repository.msg.CurrencyExchangeReport2.mmCurrencyExchangeInformation);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeReport2.mmCurrencyReference, com.tools20022.repository.msg.CurrencyExchangeReport2.mmBusinessError,
						com.tools20022.repository.msg.CurrencyExchangeReport2.mmCurrencyExchangeInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CurrencyExchangeReport2";
				definition = "Reports either on currency exchange information or on a business error.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeReport2.CurrencyExchangeInformationOrBusinessErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyReferenceDetails getCurrencyReference() {
		return currencyReference;
	}

	public CurrencyExchangeReport2 setCurrencyReference(CurrencyReferenceDetails currencyReference) {
		this.currencyReference = Objects.requireNonNull(currencyReference);
		return this;
	}

	public ErrorHandling3 getBusinessError() {
		return businessError;
	}

	public CurrencyExchangeReport2 setBusinessError(ErrorHandling3 businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}

	public CurrencyExchangeDetails getCurrencyExchangeInformation() {
		return currencyExchangeInformation;
	}

	public CurrencyExchangeReport2 setCurrencyExchangeInformation(CurrencyExchangeDetails currencyExchangeInformation) {
		this.currencyExchangeInformation = Objects.requireNonNull(currencyExchangeInformation);
		return this;
	}
}