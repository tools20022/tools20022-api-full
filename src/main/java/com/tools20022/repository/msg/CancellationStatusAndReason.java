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
import com.tools20022.repository.area.sese.TransferCancellationStatusReport;
import com.tools20022.repository.choice.PartyIdentification1Choice;
import com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice;
import com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransferCancellationStatus;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status of a transfer cancellation instruction and the reason for the status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#StatusOrRejectedOrCompleteRule
 * CancellationStatusAndReason.StatusOrRejectedOrCompleteRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmStatus
 * CancellationStatusAndReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmRejected
 * CancellationStatusAndReason.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmComplete
 * CancellationStatusAndReason.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmStatusInitiator
 * CancellationStatusAndReason.mmStatusInitiator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReport#mmStatusReport
 * TransferCancellationStatusReport.mmStatusReport}</li>
 * </ul>
 * </li>
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
 * "CancellationStatusAndReason"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a transfer cancellation instruction and the reason for the status."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CancellationStatusAndReason", propOrder = {"status", "rejected", "complete", "statusInitiator"})
public class CancellationStatusAndReason {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected TransferCancellationStatus status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus
	 * TransferCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason
	 * CancellationStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer cancellation instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationStatusAndReason, TransferCancellationStatus> mmStatus = new MMMessageAssociationEnd<CancellationStatusAndReason, TransferCancellationStatus>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the transfer cancellation instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferCancellationStatus.mmObject();
		}

		@Override
		public TransferCancellationStatus getValue(CancellationStatusAndReason obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CancellationStatusAndReason obj, TransferCancellationStatus value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected TransferCancellationRejectedStatus1Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationRejectedStatus1Choice
	 * TransferCancellationRejectedStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason
	 * CancellationStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of transfer cancellation is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationStatusAndReason, TransferCancellationRejectedStatus1Choice> mmRejected = new MMMessageAssociationEnd<CancellationStatusAndReason, TransferCancellationRejectedStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of transfer cancellation is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferCancellationRejectedStatus1Choice.mmObject();
		}

		@Override
		public TransferCancellationRejectedStatus1Choice getValue(CancellationStatusAndReason obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(CancellationStatusAndReason obj, TransferCancellationRejectedStatus1Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Cmplt", required = true)
	protected TransferCancellationCompleteStatusChoice complete;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransferCancellationCompleteStatusChoice
	 * TransferCancellationCompleteStatusChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason
	 * CancellationStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmplt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer cancellation is complete. The cancellation instruction has been accepted and processed, the cancellation is complete."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationStatusAndReason, TransferCancellationCompleteStatusChoice> mmComplete = new MMMessageAssociationEnd<CancellationStatusAndReason, TransferCancellationCompleteStatusChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "Cmplt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "Status of the transfer cancellation is complete. The cancellation instruction has been accepted and processed, the cancellation is complete.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferCancellationCompleteStatusChoice.mmObject();
		}

		@Override
		public TransferCancellationCompleteStatusChoice getValue(CancellationStatusAndReason obj) {
			return obj.getComplete();
		}

		@Override
		public void setValue(CancellationStatusAndReason obj, TransferCancellationCompleteStatusChoice value) {
			obj.setComplete(value);
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification1Choice statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
	 * PartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason
	 * CancellationStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that initiates the status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationStatusAndReason, Optional<PartyIdentification1Choice>> mmStatusInitiator = new MMMessageAssociationEnd<CancellationStatusAndReason, Optional<PartyIdentification1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationStatusAndReason.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification1Choice> getValue(CancellationStatusAndReason obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(CancellationStatusAndReason obj, Optional<PartyIdentification1Choice> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	/**
	 * One and only one message element in the list (Status, Rejected, Complete)
	 * must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason
	 * CancellationStatusAndReason}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmStatus
	 * CancellationStatusAndReason.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmRejected
	 * CancellationStatusAndReason.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmComplete
	 * CancellationStatusAndReason.mmComplete}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOrRejectedOrCompleteRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (Status, Rejected, Complete) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor StatusOrRejectedOrCompleteRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOrRejectedOrCompleteRule";
			definition = "One and only one message element in the list (Status, Rejected, Complete) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.CancellationStatusAndReason.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationStatusAndReason.mmStatus, com.tools20022.repository.msg.CancellationStatusAndReason.mmRejected,
					com.tools20022.repository.msg.CancellationStatusAndReason.mmComplete);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationStatusAndReason.mmStatus, com.tools20022.repository.msg.CancellationStatusAndReason.mmRejected,
						com.tools20022.repository.msg.CancellationStatusAndReason.mmComplete, com.tools20022.repository.msg.CancellationStatusAndReason.mmStatusInitiator);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferCancellationStatusReport.mmStatusReport);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CancellationStatusAndReason";
				definition = "Status of a transfer cancellation instruction and the reason for the status.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationStatusAndReason.StatusOrRejectedOrCompleteRule);
			}
		});
		return mmObject_lazy.get();
	}

	public TransferCancellationStatus getStatus() {
		return status;
	}

	public CancellationStatusAndReason setStatus(TransferCancellationStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public TransferCancellationRejectedStatus1Choice getRejected() {
		return rejected;
	}

	public CancellationStatusAndReason setRejected(TransferCancellationRejectedStatus1Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public TransferCancellationCompleteStatusChoice getComplete() {
		return complete;
	}

	public CancellationStatusAndReason setComplete(TransferCancellationCompleteStatusChoice complete) {
		this.complete = Objects.requireNonNull(complete);
		return this;
	}

	public Optional<PartyIdentification1Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public CancellationStatusAndReason setStatusInitiator(PartyIdentification1Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}
}