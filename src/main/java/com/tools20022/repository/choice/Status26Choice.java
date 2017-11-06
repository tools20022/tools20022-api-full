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
import com.tools20022.repository.msg.IndividualOrderStatusAndReason8;
import com.tools20022.repository.msg.OrderStatusAndReason9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.choice.Status26Choice#mmCancellationStatusReport
 * Status26Choice.mmCancellationStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status26Choice#mmIndividualCancellationStatusReport
 * Status26Choice.mmIndividualCancellationStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmStatusReport
 * OrderCancellationStatusReportV04.mmStatusReport}</li>
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
 * "Status26Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * </ul>
 */
public class Status26Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected OrderStatusAndReason9 cancellationStatusReport;
	/**
	 * Status report details of a bulk or multiple or switch order cancellation
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderStatusAndReason9
	 * OrderStatusAndReason9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status26Choice
	 * Status26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of a bulk or multiple or switch order cancellation message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationStatusReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status26Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlStsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReport";
			definition = "Status report details of a bulk or multiple or switch order cancellation message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrderStatusAndReason9.mmObject();
		}
	};
	protected List<IndividualOrderStatusAndReason8> individualCancellationStatusReport;
	/**
	 * Status report details of one or more individual orders from a bulk or
	 * multiple or switch order cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason8
	 * IndividualOrderStatusAndReason8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status26Choice
	 * Status26Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvCxlStsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualCancellationStatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of one or more individual orders from a bulk or multiple or switch order cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualCancellationStatusReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Status26Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvCxlStsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualCancellationStatusReport";
			definition = "Status report details of one or more individual orders from a bulk or multiple or switch order cancellation request.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualOrderStatusAndReason8.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status26Choice.mmCancellationStatusReport, com.tools20022.repository.choice.Status26Choice.mmIndividualCancellationStatusReport);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.mmStatusReport);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Status26Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrderStatusAndReason9 getCancellationStatusReport() {
		return cancellationStatusReport;
	}

	public void setCancellationStatusReport(OrderStatusAndReason9 cancellationStatusReport) {
		this.cancellationStatusReport = cancellationStatusReport;
	}

	public List<IndividualOrderStatusAndReason8> getIndividualCancellationStatusReport() {
		return individualCancellationStatusReport;
	}

	public void setIndividualCancellationStatusReport(List<IndividualOrderStatusAndReason8> individualCancellationStatusReport) {
		this.individualCancellationStatusReport = individualCancellationStatusReport;
	}
}