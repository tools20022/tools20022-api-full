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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Counterparty6Choice;
import com.tools20022.repository.choice.PartyIdentification59Choice;
import com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementParties17;
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
 * Details of the standing settlement instruction to be applied.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction6.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmCounterparty
 * StandingSettlementInstruction6.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmVendor
 * StandingSettlementInstruction6.mmVendor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction6.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction6.mmOtherReceivingSettlementParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
 * StandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingSettlementInstruction6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the standing settlement instruction to be applied."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintVendorPresenceRule#forStandingSettlementInstruction6
 * ConstraintVendorPresenceRule.forStandingSettlementInstruction6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingSettlementInstruction6", propOrder = {"settlementStandingInstructionDatabase", "counterparty", "vendor", "otherDeliveringSettlementParties", "otherReceivingSettlementParties"})
public class StandingSettlementInstruction6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmStgInstrDB", required = true)
	protected SettlementStandingInstructionDatabase2Choice settlementStandingInstructionDatabase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase2Choice
	 * SettlementStandingInstructionDatabase2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6
	 * StandingSettlementInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmStgInstrDB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStandingInstructionDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DBNM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingSettlementInstruction6, SettlementStandingInstructionDatabase2Choice> mmSettlementStandingInstructionDatabase = new MMMessageAssociationEnd<StandingSettlementInstruction6, SettlementStandingInstructionDatabase2Choice>() {
		{
			businessComponentTrace_lazy = () -> StandingSettlementInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction6.mmObject();
			isDerived = false;
			xmlTag = "SttlmStgInstrDB";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DBNM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStandingInstructionDatabase";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementStandingInstructionDatabase2Choice.mmObject();
		}

		@Override
		public SettlementStandingInstructionDatabase2Choice getValue(StandingSettlementInstruction6 obj) {
			return obj.getSettlementStandingInstructionDatabase();
		}

		@Override
		public void setValue(StandingSettlementInstruction6 obj, SettlementStandingInstructionDatabase2Choice value) {
			obj.setSettlementStandingInstructionDatabase(value);
		}
	};
	@XmlElement(name = "CtrPty", required = true)
	protected Counterparty6Choice counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Counterparty6Choice
	 * Counterparty6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6
	 * StandingSettlementInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the buyer or seller in a standing settlement instruction enabling to derive the Standing Settlement Instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::SELL or BUYR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingSettlementInstruction6, Counterparty6Choice> mmCounterparty = new MMMessageAssociationEnd<StandingSettlementInstruction6, Counterparty6Choice>() {
		{
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction6.mmObject();
			isDerived = false;
			xmlTag = "CtrPty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::SELL or BUYR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterparty";
			definition = "Identification of the buyer or seller in a standing settlement instruction enabling to derive the Standing Settlement Instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Counterparty6Choice.mmObject();
		}

		@Override
		public Counterparty6Choice getValue(StandingSettlementInstruction6 obj) {
			return obj.getCounterparty();
		}

		@Override
		public void setValue(StandingSettlementInstruction6 obj, Counterparty6Choice value) {
			obj.setCounterparty(value);
		}
	};
	@XmlElement(name = "Vndr")
	protected PartyIdentification59Choice vendor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice
	 * PartyIdentification59Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6
	 * StandingSettlementInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vndr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vendor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vendor of the Settlement Standing Instruction database requested to be consulted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::VEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingSettlementInstruction6, Optional<PartyIdentification59Choice>> mmVendor = new MMMessageAssociationEnd<StandingSettlementInstruction6, Optional<PartyIdentification59Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction6.mmObject();
			isDerived = false;
			xmlTag = "Vndr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::VEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vendor";
			definition = "Vendor of the Settlement Standing Instruction database requested to be consulted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification59Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification59Choice> getValue(StandingSettlementInstruction6 obj) {
			return obj.getVendor();
		}

		@Override
		public void setValue(StandingSettlementInstruction6 obj, Optional<PartyIdentification59Choice> value) {
			obj.setVendor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDlvrgSttlmPties")
	protected SettlementParties17 otherDeliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties17
	 * SettlementParties17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6
	 * StandingSettlementInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivering parties, other than the seller, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingSettlementInstruction6, Optional<SettlementParties17>> mmOtherDeliveringSettlementParties = new MMMessageAssociationEnd<StandingSettlementInstruction6, Optional<SettlementParties17>>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction6.mmObject();
			isDerived = false;
			xmlTag = "OthrDlvrgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDeliveringSettlementParties";
			definition = "Delivering parties, other than the seller, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties17.mmObject();
		}

		@Override
		public Optional<SettlementParties17> getValue(StandingSettlementInstruction6 obj) {
			return obj.getOtherDeliveringSettlementParties();
		}

		@Override
		public void setValue(StandingSettlementInstruction6 obj, Optional<SettlementParties17> value) {
			obj.setOtherDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrRcvgSttlmPties")
	protected SettlementParties17 otherReceivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties17
	 * SettlementParties17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6
	 * StandingSettlementInstruction6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Receiving parties, other than the buyer, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StandingSettlementInstruction6, Optional<SettlementParties17>> mmOtherReceivingSettlementParties = new MMMessageAssociationEnd<StandingSettlementInstruction6, Optional<SettlementParties17>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction6.mmObject();
			isDerived = false;
			xmlTag = "OthrRcvgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReceivingSettlementParties";
			definition = "Receiving parties, other than the buyer, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties17.mmObject();
		}

		@Override
		public Optional<SettlementParties17> getValue(StandingSettlementInstruction6 obj) {
			return obj.getOtherReceivingSettlementParties();
		}

		@Override
		public void setValue(StandingSettlementInstruction6 obj, Optional<SettlementParties17> value) {
			obj.setOtherReceivingSettlementParties(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingSettlementInstruction6.mmSettlementStandingInstructionDatabase, com.tools20022.repository.msg.StandingSettlementInstruction6.mmCounterparty,
						com.tools20022.repository.msg.StandingSettlementInstruction6.mmVendor, com.tools20022.repository.msg.StandingSettlementInstruction6.mmOtherDeliveringSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction6.mmOtherReceivingSettlementParties);
				trace_lazy = () -> StandingSettlementInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintVendorPresenceRule.forStandingSettlementInstruction6);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "StandingSettlementInstruction6";
				definition = "Details of the standing settlement instruction to be applied.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementStandingInstructionDatabase2Choice getSettlementStandingInstructionDatabase() {
		return settlementStandingInstructionDatabase;
	}

	public StandingSettlementInstruction6 setSettlementStandingInstructionDatabase(SettlementStandingInstructionDatabase2Choice settlementStandingInstructionDatabase) {
		this.settlementStandingInstructionDatabase = Objects.requireNonNull(settlementStandingInstructionDatabase);
		return this;
	}

	public Counterparty6Choice getCounterparty() {
		return counterparty;
	}

	public StandingSettlementInstruction6 setCounterparty(Counterparty6Choice counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}

	public Optional<PartyIdentification59Choice> getVendor() {
		return vendor == null ? Optional.empty() : Optional.of(vendor);
	}

	public StandingSettlementInstruction6 setVendor(PartyIdentification59Choice vendor) {
		this.vendor = vendor;
		return this;
	}

	public Optional<SettlementParties17> getOtherDeliveringSettlementParties() {
		return otherDeliveringSettlementParties == null ? Optional.empty() : Optional.of(otherDeliveringSettlementParties);
	}

	public StandingSettlementInstruction6 setOtherDeliveringSettlementParties(SettlementParties17 otherDeliveringSettlementParties) {
		this.otherDeliveringSettlementParties = otherDeliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties17> getOtherReceivingSettlementParties() {
		return otherReceivingSettlementParties == null ? Optional.empty() : Optional.of(otherReceivingSettlementParties);
	}

	public StandingSettlementInstruction6 setOtherReceivingSettlementParties(SettlementParties17 otherReceivingSettlementParties) {
		this.otherReceivingSettlementParties = otherReceivingSettlementParties;
		return this;
	}
}