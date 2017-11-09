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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SystemBusinessInformation;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Reports either on the business information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmGeneralBusinessInformationOrErrorRule
 * GeneralBusinessReport2.mmGeneralBusinessInformationOrErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmBusinessInformationReference
 * GeneralBusinessReport2.mmBusinessInformationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmBusinessError
 * GeneralBusinessReport2.mmBusinessError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmGeneralBusinessInformation
 * GeneralBusinessReport2.mmGeneralBusinessInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
 * SystemBusinessInformation}</li>
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
 * "GeneralBusinessReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the business information or on a business error."</li>
 * </ul>
 */
public class GeneralBusinessReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text businessInformationReference;
	/**
	 * Unique and unambiguous identification of a general business information
	 * system, as assigned by the system transaction administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmIdentification
	 * SystemBusinessInformation.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2
	 * GeneralBusinessReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizInfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessInformationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessInformationReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemBusinessInformation.mmIdentification;
			componentContext_lazy = () -> GeneralBusinessReport2.mmObject();
			isDerived = false;
			xmlTag = "BizInfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessInformationReference";
			definition = "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ErrorHandling3 businessError;
	/**
	 * Reason the requested business information is not given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2
	 * GeneralBusinessReport2}</li>
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
			componentContext_lazy = () -> GeneralBusinessReport2.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ErrorHandling3.mmObject();
		}
	};
	protected GeneralBusinessInformation generalBusinessInformation;
	/**
	 * Requested business information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformation
	 * GeneralBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2
	 * GeneralBusinessReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnlBizInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralBusinessInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested business information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGeneralBusinessInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SystemBusinessInformation.mmObject();
			componentContext_lazy = () -> GeneralBusinessReport2.mmObject();
			isDerived = false;
			xmlTag = "GnlBizInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralBusinessInformation";
			definition = "Requested business information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GeneralBusinessInformation.mmObject();
		}
	};
	/**
	 * Either GeneralBusinessInformation or BusinessError must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2
	 * GeneralBusinessReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmBusinessError
	 * GeneralBusinessReport2.mmBusinessError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmGeneralBusinessInformation
	 * GeneralBusinessReport2.mmGeneralBusinessInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralBusinessInformationOrErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either GeneralBusinessInformation or BusinessError must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmGeneralBusinessInformationOrErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralBusinessInformationOrErrorRule";
			definition = "Either GeneralBusinessInformation or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> GeneralBusinessReport2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(GeneralBusinessReport2.mmBusinessError, GeneralBusinessReport2.mmGeneralBusinessInformation);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GeneralBusinessReport2.mmBusinessInformationReference, GeneralBusinessReport2.mmBusinessError, GeneralBusinessReport2.mmGeneralBusinessInformation);
				trace_lazy = () -> SystemBusinessInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "GeneralBusinessReport2";
				definition = "Reports either on the business information or on a business error.";
				xors_lazy = () -> Arrays.asList(GeneralBusinessReport2.mmGeneralBusinessInformationOrErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBusinessInformationReference() {
		return businessInformationReference;
	}

	public void setBusinessInformationReference(Max35Text businessInformationReference) {
		this.businessInformationReference = businessInformationReference;
	}

	public ErrorHandling3 getBusinessError() {
		return businessError;
	}

	public void setBusinessError(com.tools20022.repository.msg.ErrorHandling3 businessError) {
		this.businessError = businessError;
	}

	public GeneralBusinessInformation getGeneralBusinessInformation() {
		return generalBusinessInformation;
	}

	public void setGeneralBusinessInformation(com.tools20022.repository.msg.GeneralBusinessInformation generalBusinessInformation) {
		this.generalBusinessInformation = generalBusinessInformation;
	}
}