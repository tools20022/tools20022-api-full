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
import com.tools20022.repository.area.setr.OrderCancellationStatusReportV04;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualOrderStatusAndReason8;
import com.tools20022.repository.msg.OrderStatusAndReason9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Status26Choice", propOrder = {"cancellationStatusReport", "individualCancellationStatusReport"})
public class Status26Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlStsRpt", required = true)
	protected OrderStatusAndReason9 cancellationStatusReport;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Status26Choice, OrderStatusAndReason9> mmCancellationStatusReport = new MMMessageAssociationEnd<Status26Choice, OrderStatusAndReason9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Status26Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlStsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReport";
			definition = "Status report details of a bulk or multiple or switch order cancellation message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrderStatusAndReason9.mmObject();
		}

		@Override
		public OrderStatusAndReason9 getValue(Status26Choice obj) {
			return obj.getCancellationStatusReport();
		}

		@Override
		public void setValue(Status26Choice obj, OrderStatusAndReason9 value) {
			obj.setCancellationStatusReport(value);
		}
	};
	@XmlElement(name = "IndvCxlStsRpt", required = true)
	protected List<IndividualOrderStatusAndReason8> individualCancellationStatusReport;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Status26Choice, List<IndividualOrderStatusAndReason8>> mmIndividualCancellationStatusReport = new MMMessageAssociationEnd<Status26Choice, List<IndividualOrderStatusAndReason8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Status26Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvCxlStsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualCancellationStatusReport";
			definition = "Status report details of one or more individual orders from a bulk or multiple or switch order cancellation request.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualOrderStatusAndReason8.mmObject();
		}

		@Override
		public List<IndividualOrderStatusAndReason8> getValue(Status26Choice obj) {
			return obj.getIndividualCancellationStatusReport();
		}

		@Override
		public void setValue(Status26Choice obj, List<IndividualOrderStatusAndReason8> value) {
			obj.setIndividualCancellationStatusReport(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status26Choice.mmCancellationStatusReport, com.tools20022.repository.choice.Status26Choice.mmIndividualCancellationStatusReport);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderCancellationStatusReportV04.mmStatusReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status26Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrderStatusAndReason9 getCancellationStatusReport() {
		return cancellationStatusReport;
	}

	public Status26Choice setCancellationStatusReport(OrderStatusAndReason9 cancellationStatusReport) {
		this.cancellationStatusReport = Objects.requireNonNull(cancellationStatusReport);
		return this;
	}

	public List<IndividualOrderStatusAndReason8> getIndividualCancellationStatusReport() {
		return individualCancellationStatusReport == null ? individualCancellationStatusReport = new ArrayList<>() : individualCancellationStatusReport;
	}

	public Status26Choice setIndividualCancellationStatusReport(List<IndividualOrderStatusAndReason8> individualCancellationStatusReport) {
		this.individualCancellationStatusReport = Objects.requireNonNull(individualCancellationStatusReport);
		return this;
	}
}