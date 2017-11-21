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
import com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status is accepted under certain conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#mmNoSpecifiedReasonOrReasonDetailsRule
 * ConditionallyAcceptedStatus2.mmNoSpecifiedReasonOrReasonDetailsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#mmNoSpecifiedReason
 * ConditionallyAcceptedStatus2.mmNoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#mmReasonDetails
 * ConditionallyAcceptedStatus2.mmReasonDetails}</li>
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
 * "ConditionallyAcceptedStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status is accepted under certain conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
 * ConditionallyAcceptedStatus3Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ConditionallyAcceptedStatus2", propOrder = {"noSpecifiedReason", "reasonDetails"})
public class ConditionallyAcceptedStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NoReasonCode noSpecifiedReason;
	/**
	 * Indicates that there is no reason available or to report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
	 * StatusReason.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2
	 * ConditionallyAcceptedStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoSpcfdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmNoSpecifiedReason
	 * ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoSpecifiedReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmNoSpecifiedReason;
			componentContext_lazy = () -> ConditionallyAcceptedStatus2.mmObject();
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			nextVersions_lazy = () -> Arrays.asList(ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2> reasonDetails;
	/**
	 * Reason for the conditionally accepted status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2
	 * ConditionallyAcceptedStatusReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2
	 * ConditionallyAcceptedStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the conditionally accepted status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmReasonDetails
	 * ConditionallyAcceptedStatus3Choice.mmReasonDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReasonDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> ConditionallyAcceptedStatus2.mmObject();
			isDerived = false;
			xmlTag = "RsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonDetails";
			definition = "Reason for the conditionally accepted status.";
			nextVersions_lazy = () -> Arrays.asList(ConditionallyAcceptedStatus3Choice.mmReasonDetails);
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2.mmObject();
		}
	};
	/**
	 * Either NoSpecifiedReason or ReasonDetails must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2
	 * ConditionallyAcceptedStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#mmNoSpecifiedReason
	 * ConditionallyAcceptedStatus2.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatus2#mmReasonDetails
	 * ConditionallyAcceptedStatus2.mmReasonDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReasonOrReasonDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either NoSpecifiedReason or ReasonDetails must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmNoSpecifiedReasonOrReasonDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReasonOrReasonDetailsRule";
			definition = "Either NoSpecifiedReason or ReasonDetails must be present, but not both.";
			messageComponent_lazy = () -> ConditionallyAcceptedStatus2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(ConditionallyAcceptedStatus2.mmNoSpecifiedReason, ConditionallyAcceptedStatus2.mmReasonDetails);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ConditionallyAcceptedStatus2.mmNoSpecifiedReason, ConditionallyAcceptedStatus2.mmReasonDetails);
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
				name = "ConditionallyAcceptedStatus2";
				definition = "Status is accepted under certain conditions.";
				nextVersions_lazy = () -> Arrays.asList(ConditionallyAcceptedStatus3Choice.mmObject());
				xors_lazy = () -> Arrays.asList(ConditionallyAcceptedStatus2.mmNoSpecifiedReasonOrReasonDetailsRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NoSpcfdRsn", required = true)
	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public void setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = noSpecifiedReason;
	}

	@XmlElement(name = "RsnDtls", required = true)
	public List<ConditionallyAcceptedStatusReason2> getReasonDetails() {
		return reasonDetails;
	}

	public void setReasonDetails(List<com.tools20022.repository.msg.ConditionallyAcceptedStatusReason2> reasonDetails) {
		this.reasonDetails = reasonDetails;
	}
}