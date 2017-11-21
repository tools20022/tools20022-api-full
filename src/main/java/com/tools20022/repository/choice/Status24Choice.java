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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.OrderInstructionStatusReportV04;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualOrderStatusAndReason7;
import com.tools20022.repository.msg.OrderStatusAndReason10;
import com.tools20022.repository.msg.SwitchOrderStatusAndReason2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status24Choice#mmOrderDetailsReport
 * Status24Choice.mmOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status24Choice#mmIndividualOrderDetailsReport
 * Status24Choice.mmIndividualOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status24Choice#mmSwitchOrderDetailsReport
 * Status24Choice.mmSwitchOrderDetailsReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmStatusReport
 * OrderInstructionStatusReportV04.mmStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Status24Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Status24Choice", propOrder = {"orderDetailsReport", "individualOrderDetailsReport", "switchOrderDetailsReport"})
public class Status24Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected OrderStatusAndReason10 orderDetailsReport;
	/**
	 * Status report details of all the individual orders conveyed in a bulk or
	 * multiple order message. Can be used if all the individual orders conveyed
	 * in a bulk or multiple order message have the same status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderStatusAndReason10
	 * OrderStatusAndReason10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status24Choice
	 * Status24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of all the individual orders conveyed in a bulk or multiple order message. Can be used if all the individual orders conveyed in a bulk or multiple order message have the same status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderDetailsReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status24Choice.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsReport";
			definition = "Status report details of all the individual orders conveyed in a bulk or multiple order message. Can be used if all the individual orders conveyed in a bulk or multiple order message have the same status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrderStatusAndReason10.mmObject();
		}
	};
	protected List<IndividualOrderStatusAndReason7> individualOrderDetailsReport;
	/**
	 * Status report details of an individual order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status24Choice
	 * Status24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOrdrDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status report details of an individual order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualOrderDetailsReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status24Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvOrdrDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderDetailsReport";
			definition = "Status report details of an individual order.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualOrderStatusAndReason7.mmObject();
		}
	};
	protected List<SwitchOrderStatusAndReason2> switchOrderDetailsReport;
	/**
	 * Status report details of a switch order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status24Choice
	 * Status24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchOrdrDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status report details of a switch order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwitchOrderDetailsReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status24Choice.mmObject();
			isDerived = false;
			xmlTag = "SwtchOrdrDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOrderDetailsReport";
			definition = "Status report details of a switch order.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SwitchOrderStatusAndReason2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Status24Choice.mmOrderDetailsReport, Status24Choice.mmIndividualOrderDetailsReport, Status24Choice.mmSwitchOrderDetailsReport);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderInstructionStatusReportV04.mmStatusReport);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status24Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OrdrDtlsRpt", required = true)
	public OrderStatusAndReason10 getOrderDetailsReport() {
		return orderDetailsReport;
	}

	public void setOrderDetailsReport(OrderStatusAndReason10 orderDetailsReport) {
		this.orderDetailsReport = orderDetailsReport;
	}

	@XmlElement(name = "IndvOrdrDtlsRpt", required = true)
	public List<IndividualOrderStatusAndReason7> getIndividualOrderDetailsReport() {
		return individualOrderDetailsReport;
	}

	public void setIndividualOrderDetailsReport(List<IndividualOrderStatusAndReason7> individualOrderDetailsReport) {
		this.individualOrderDetailsReport = individualOrderDetailsReport;
	}

	@XmlElement(name = "SwtchOrdrDtlsRpt", required = true)
	public List<SwitchOrderStatusAndReason2> getSwitchOrderDetailsReport() {
		return switchOrderDetailsReport;
	}

	public void setSwitchOrderDetailsReport(List<SwitchOrderStatusAndReason2> switchOrderDetailsReport) {
		this.switchOrderDetailsReport = switchOrderDetailsReport;
	}
}