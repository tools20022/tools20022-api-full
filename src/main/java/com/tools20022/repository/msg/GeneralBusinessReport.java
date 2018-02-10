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
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on the business information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#GeneralBusinessInformationOrErrorRule
 * GeneralBusinessReport.GeneralBusinessInformationOrErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#mmBusinessInformationReference
 * GeneralBusinessReport.mmBusinessInformationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#mmBusinessError
 * GeneralBusinessReport.mmBusinessError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#mmGeneralBusinessInformation
 * GeneralBusinessReport.mmGeneralBusinessInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
 * SystemBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeneralBusinessReport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the business information or on a business error."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeneralBusinessReport", propOrder = {"businessInformationReference", "businessError", "generalBusinessInformation"})
public class GeneralBusinessReport {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BizInfRef", required = true)
	protected Max35Text businessInformationReference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport
	 * GeneralBusinessReport}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessReport.mmObject();
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
	@XmlElement(name = "BizErr", required = true)
	protected ErrorHandling2 businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling2
	 * ErrorHandling2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport
	 * GeneralBusinessReport}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessReport.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ErrorHandling2.mmObject();
		}
	};
	@XmlElement(name = "GnlBizInf", required = true)
	protected GeneralBusinessInformation generalBusinessInformation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport
	 * GeneralBusinessReport}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessReport.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport
	 * GeneralBusinessReport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#mmBusinessError
	 * GeneralBusinessReport.mmBusinessError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#mmGeneralBusinessInformation
	 * GeneralBusinessReport.mmGeneralBusinessInformation}</li>
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
	public static final MMXor GeneralBusinessInformationOrErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralBusinessInformationOrErrorRule";
			definition = "Either GeneralBusinessInformation or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.GeneralBusinessReport.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport.mmBusinessError, com.tools20022.repository.msg.GeneralBusinessReport.mmGeneralBusinessInformation);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport.mmBusinessInformationReference, com.tools20022.repository.msg.GeneralBusinessReport.mmBusinessError,
						com.tools20022.repository.msg.GeneralBusinessReport.mmGeneralBusinessInformation);
				trace_lazy = () -> SystemBusinessInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "GeneralBusinessReport";
				definition = "Reports either on the business information or on a business error.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport.GeneralBusinessInformationOrErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBusinessInformationReference() {
		return businessInformationReference;
	}

	public GeneralBusinessReport setBusinessInformationReference(Max35Text businessInformationReference) {
		this.businessInformationReference = Objects.requireNonNull(businessInformationReference);
		return this;
	}

	public ErrorHandling2 getBusinessError() {
		return businessError;
	}

	public GeneralBusinessReport setBusinessError(com.tools20022.repository.msg.ErrorHandling2 businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}

	public GeneralBusinessInformation getGeneralBusinessInformation() {
		return generalBusinessInformation;
	}

	public GeneralBusinessReport setGeneralBusinessInformation(com.tools20022.repository.msg.GeneralBusinessInformation generalBusinessInformation) {
		this.generalBusinessInformation = Objects.requireNonNull(generalBusinessInformation);
		return this;
	}
}