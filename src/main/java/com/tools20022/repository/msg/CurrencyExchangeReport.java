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
import com.tools20022.metamodel.MMXor;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Reports either on currency exchange information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport#mmCurrencyExchangeInformationOrBusinessErrorRule
 * CurrencyExchangeReport.mmCurrencyExchangeInformationOrBusinessErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport#mmCurrencyReference
 * CurrencyExchangeReport.mmCurrencyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport#mmBusinessError
 * CurrencyExchangeReport.mmBusinessError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport#mmCurrencyExchangeInformation
 * CurrencyExchangeReport.mmCurrencyExchangeInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyExchangeReport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on currency exchange information or on a business error."</li>
 * </ul>
 */
public class CurrencyExchangeReport {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyReferenceDetails currencyReference;
	/**
	 * Source and target currencies for which information is request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails
	 * CurrencyReferenceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport
	 * CurrencyExchangeReport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source and target currencies for which information is request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyExchangeReport.mmObject();
			isDerived = false;
			xmlTag = "CcyRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyReference";
			definition = "Source and target currencies for which information is request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyReferenceDetails.mmObject();
		}
	};
	protected ErrorHandling2 businessError;
	/**
	 * Reason the requested business information is not given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling2
	 * ErrorHandling2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport
	 * CurrencyExchangeReport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBusinessError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyExchangeReport.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ErrorHandling2.mmObject();
		}
	};
	protected CurrencyExchangeDetails currencyExchangeInformation;
	/**
	 * Requested business information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails
	 * CurrencyExchangeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport
	 * CurrencyExchangeReport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested business information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyExchangeInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyExchangeReport.mmObject();
			isDerived = false;
			xmlTag = "CcyXchgInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchangeInformation";
			definition = "Requested business information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeDetails.mmObject();
		}
	};
	/**
	 * Either CurrencyExchangeInformation or BusinessError must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport#mmBusinessError
	 * CurrencyExchangeReport.mmBusinessError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport#mmCurrencyExchangeInformation
	 * CurrencyExchangeReport.mmCurrencyExchangeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport
	 * CurrencyExchangeReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeInformationOrBusinessErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CurrencyExchangeInformation or BusinessError must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmCurrencyExchangeInformationOrBusinessErrorRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchangeInformationOrBusinessErrorRule";
			definition = "Either CurrencyExchangeInformation or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> CurrencyExchangeReport.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeReport.mmBusinessError, com.tools20022.repository.msg.CurrencyExchangeReport.mmCurrencyExchangeInformation);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeReport.mmCurrencyReference, com.tools20022.repository.msg.CurrencyExchangeReport.mmBusinessError,
						com.tools20022.repository.msg.CurrencyExchangeReport.mmCurrencyExchangeInformation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CurrencyExchangeReport";
				definition = "Reports either on currency exchange information or on a business error.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeReport.mmCurrencyExchangeInformationOrBusinessErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyReferenceDetails getCurrencyReference() {
		return currencyReference;
	}

	public void setCurrencyReference(com.tools20022.repository.msg.CurrencyReferenceDetails currencyReference) {
		this.currencyReference = currencyReference;
	}

	public ErrorHandling2 getBusinessError() {
		return businessError;
	}

	public void setBusinessError(com.tools20022.repository.msg.ErrorHandling2 businessError) {
		this.businessError = businessError;
	}

	public CurrencyExchangeDetails getCurrencyExchangeInformation() {
		return currencyExchangeInformation;
	}

	public void setCurrencyExchangeInformation(com.tools20022.repository.msg.CurrencyExchangeDetails currencyExchangeInformation) {
		this.currencyExchangeInformation = currencyExchangeInformation;
	}
}