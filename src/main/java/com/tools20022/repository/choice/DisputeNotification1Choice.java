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
import com.tools20022.repository.area.colr.MarginCallDisputeNotificationV03;
import com.tools20022.repository.area.colr.MarginCallDisputeNotificationV04;
import com.tools20022.repository.entity.DisputeManagement;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DisputeNotification1;
import com.tools20022.repository.msg.SegregatedIndependentAmountDispute1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the dispute notification details for the variation margin and the
 * segregated independent amount, or the segregated independent amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DisputeNotification1Choice#mmDisputeNotificationDetails
 * DisputeNotification1Choice.mmDisputeNotificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DisputeNotification1Choice#mmSegregatedIndependentAmountDisputeDetails
 * DisputeNotification1Choice.mmSegregatedIndependentAmountDisputeDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DisputeManagement
 * DisputeManagement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV03#mmDisputeNotification
 * MarginCallDisputeNotificationV03.mmDisputeNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV04#mmDisputeNotification
 * MarginCallDisputeNotificationV04.mmDisputeNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisputeNotification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the dispute notification details for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DisputeNotification1Choice", propOrder = {"disputeNotificationDetails", "segregatedIndependentAmountDisputeDetails"})
public class DisputeNotification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DsptNtfctnDtls", required = true)
	protected DisputeNotification1 disputeNotificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DisputeNotification1
	 * DisputeNotification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DisputeNotification1Choice
	 * DisputeNotification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsptNtfctnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeNotificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the dispute notification details for the variation margin and optionaly the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DisputeNotification1Choice, DisputeNotification1> mmDisputeNotificationDetails = new MMMessageAssociationEnd<DisputeNotification1Choice, DisputeNotification1>() {
		{
			businessComponentTrace_lazy = () -> DisputeManagement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.DisputeNotification1Choice.mmObject();
			isDerived = false;
			xmlTag = "DsptNtfctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeNotificationDetails";
			definition = "Provides the dispute notification details for the variation margin and optionaly the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DisputeNotification1.mmObject();
		}

		@Override
		public DisputeNotification1 getValue(DisputeNotification1Choice obj) {
			return obj.getDisputeNotificationDetails();
		}

		@Override
		public void setValue(DisputeNotification1Choice obj, DisputeNotification1 value) {
			obj.setDisputeNotificationDetails(value);
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmtDsptDtls", required = true)
	protected SegregatedIndependentAmountDispute1 segregatedIndependentAmountDisputeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountDispute1
	 * SegregatedIndependentAmountDispute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSegregatedIndependentAmount
	 * MarginCall.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DisputeNotification1Choice
	 * DisputeNotification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmtDsptDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountDisputeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the dispute notification details for the segregated independent amount only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DisputeNotification1Choice, SegregatedIndependentAmountDispute1> mmSegregatedIndependentAmountDisputeDetails = new MMMessageAssociationEnd<DisputeNotification1Choice, SegregatedIndependentAmountDispute1>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.DisputeNotification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmtDsptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountDisputeDetails";
			definition = "Provides the dispute notification details for the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SegregatedIndependentAmountDispute1.mmObject();
		}

		@Override
		public SegregatedIndependentAmountDispute1 getValue(DisputeNotification1Choice obj) {
			return obj.getSegregatedIndependentAmountDisputeDetails();
		}

		@Override
		public void setValue(DisputeNotification1Choice obj, SegregatedIndependentAmountDispute1 value) {
			obj.setSegregatedIndependentAmountDisputeDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DisputeNotification1Choice.mmDisputeNotificationDetails,
						com.tools20022.repository.choice.DisputeNotification1Choice.mmSegregatedIndependentAmountDisputeDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallDisputeNotificationV03.mmDisputeNotification, MarginCallDisputeNotificationV04.mmDisputeNotification);
				trace_lazy = () -> DisputeManagement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisputeNotification1Choice";
				definition = "Provides the dispute notification details for the variation margin and the segregated independent amount, or the segregated independent amount only.";
			}
		});
		return mmObject_lazy.get();
	}

	public DisputeNotification1 getDisputeNotificationDetails() {
		return disputeNotificationDetails;
	}

	public DisputeNotification1Choice setDisputeNotificationDetails(DisputeNotification1 disputeNotificationDetails) {
		this.disputeNotificationDetails = Objects.requireNonNull(disputeNotificationDetails);
		return this;
	}

	public SegregatedIndependentAmountDispute1 getSegregatedIndependentAmountDisputeDetails() {
		return segregatedIndependentAmountDisputeDetails;
	}

	public DisputeNotification1Choice setSegregatedIndependentAmountDisputeDetails(SegregatedIndependentAmountDispute1 segregatedIndependentAmountDisputeDetails) {
		this.segregatedIndependentAmountDisputeDetails = Objects.requireNonNull(segregatedIndependentAmountDisputeDetails);
		return this;
	}
}