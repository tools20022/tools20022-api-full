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
import com.tools20022.repository.choice.SuspendedStatusReason5Choice;
import com.tools20022.repository.codeset.SuspendedStatusReason3Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the reason for the suspended status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmReasonOrExtendedReasonOrDSSRule
 * SuspendedStatusReason2.mmReasonOrExtendedReasonOrDSSRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmReason
 * SuspendedStatusReason2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmExtendedReason
 * SuspendedStatusReason2.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmDataSourceScheme
 * SuspendedStatusReason2.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmAdditionalInformation
 * SuspendedStatusReason2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
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
 * "SuspendedStatusReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the reason for the suspended status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason5Choice
 * SuspendedStatusReason5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SuspendedStatusReason4
 * SuspendedStatusReason4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SuspendedStatusReason2", propOrder = {"reason", "extendedReason", "dataSourceScheme", "additionalInformation"})
public class SuspendedStatusReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SuspendedStatusReason3Code reason;
	/**
	 * Reason for the suspended status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason3Code
	 * SuspendedStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmSuspendedStatusReason
	 * SecuritiesOrderStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2
	 * SuspendedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the suspended status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> SuspendedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the suspended status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReason3Code.mmObject();
		}
	};
	protected Extended350Code extendedReason;
	/**
	 * Reason for the suspended status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2
	 * SuspendedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the suspended status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SuspendedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "Reason for the suspended status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected GenericIdentification1 dataSourceScheme;
	/**
	 * Proprietary identification of the reason for the suspended status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2
	 * SuspendedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSrcSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the reason for the suspended status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSourceScheme = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmDataSourceScheme;
			componentContext_lazy = () -> SuspendedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the suspended status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification1.mmObject();
		}
	};
	protected Max350Text additionalInformation;
	/**
	 * Additional information about the suspended status reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2
	 * SuspendedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the suspended status reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> SuspendedStatusReason2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the suspended status reason.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (Reason, ExtendedReason,
	 * DataSourceScheme) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2
	 * SuspendedStatusReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmReason
	 * SuspendedStatusReason2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmExtendedReason
	 * SuspendedStatusReason2.mmExtendedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SuspendedStatusReason2#mmDataSourceScheme
	 * SuspendedStatusReason2.mmDataSourceScheme}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonOrExtendedReasonOrDSSRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmReasonOrExtendedReasonOrDSSRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonOrExtendedReasonOrDSSRule";
			definition = "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme) must be present.";
			messageComponent_lazy = () -> SuspendedStatusReason2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(SuspendedStatusReason2.mmReason, SuspendedStatusReason2.mmExtendedReason, SuspendedStatusReason2.mmDataSourceScheme);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SuspendedStatusReason2.mmReason, SuspendedStatusReason2.mmExtendedReason, SuspendedStatusReason2.mmDataSourceScheme, SuspendedStatusReason2.mmAdditionalInformation);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SuspendedStatusReason2";
				definition = "Identification of the reason for the suspended status.";
				nextVersions_lazy = () -> Arrays.asList(SuspendedStatusReason5Choice.mmObject(), SuspendedStatusReason4.mmObject());
				xors_lazy = () -> Arrays.asList(SuspendedStatusReason2.mmReasonOrExtendedReasonOrDSSRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rsn", required = true)
	public SuspendedStatusReason3Code getReason() {
		return reason;
	}

	public void setReason(SuspendedStatusReason3Code reason) {
		this.reason = reason;
	}

	@XmlElement(name = "XtndedRsn", required = true)
	public Extended350Code getExtendedReason() {
		return extendedReason;
	}

	public void setExtendedReason(Extended350Code extendedReason) {
		this.extendedReason = extendedReason;
	}

	@XmlElement(name = "DataSrcSchme", required = true)
	public GenericIdentification1 getDataSourceScheme() {
		return dataSourceScheme;
	}

	public void setDataSourceScheme(com.tools20022.repository.msg.GenericIdentification1 dataSourceScheme) {
		this.dataSourceScheme = dataSourceScheme;
	}

	@XmlElement(name = "AddtlInf")
	public Max350Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}