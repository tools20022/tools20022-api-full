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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.Counterparty4Choice;
import com.tools20022.repository.choice.PartyIdentification43Choice;
import com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmSettlementStandingInstructionDatabase
 * StandingSettlementInstruction4.mmSettlementStandingInstructionDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmCounterparty
 * StandingSettlementInstruction4.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmVendor
 * StandingSettlementInstruction4.mmVendor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction4.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction4.mmOtherReceivingSettlementParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
 * StandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionConfirmationV02.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionConfirmationV03.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionConfirmationV04.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionInstructionV02.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionInstructionV03.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionInstructionV04.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionInstructionV05.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionConfirmationV05.
 * mmStandingSettlementInstructionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintVendorPresenceRule#forStandingSettlementInstruction4
 * ConstraintVendorPresenceRule.forStandingSettlementInstruction4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingSettlementInstruction4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the standing settlement instruction to be applied."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StandingSettlementInstruction4", propOrder = {"settlementStandingInstructionDatabase", "counterparty", "vendor", "otherDeliveringSettlementParties", "otherReceivingSettlementParties"})
public class StandingSettlementInstruction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmStgInstrDB", required = true)
	protected SettlementStandingInstructionDatabase1Choice settlementStandingInstructionDatabase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStandingInstructionDatabase1Choice
	 * SettlementStandingInstructionDatabase1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
	 * StandingSettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmStgInstrDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DBNM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStandingInstructionDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementStandingInstructionDatabase = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> StandingSettlementInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "SttlmStgInstrDB";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DBNM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStandingInstructionDatabase";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementStandingInstructionDatabase1Choice.mmObject();
		}
	};
	@XmlElement(name = "CtrPty", required = true)
	protected Counterparty4Choice counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Counterparty4Choice
	 * Counterparty4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
	 * StandingSettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::SELL or BUYR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the buyer or seller in a standing settlement instruction enabling to derive the Standing Settlement Instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterparty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "CtrPty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::SELL or BUYR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterparty";
			definition = "Identification of the buyer or seller in a standing settlement instruction enabling to derive the Standing Settlement Instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Counterparty4Choice.mmObject();
		}
	};
	@XmlElement(name = "Vndr")
	protected PartyIdentification43Choice vendor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
	 * StandingSettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::VEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vendor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vendor of the Settlement Standing Instruction database requested to be consulted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVendor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "Vndr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::VEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vendor";
			definition = "Vendor of the Settlement Standing Instruction database requested to be consulted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43Choice.mmObject();
		}
	};
	@XmlElement(name = "OthrDlvrgSttlmPties")
	protected SettlementParties11 otherDeliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
	 * StandingSettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivering parties, other than the seller, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "OthrDlvrgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDeliveringSettlementParties";
			definition = "Delivering parties, other than the seller, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties11.mmObject();
		}
	};
	@XmlElement(name = "OthrRcvgSttlmPties")
	protected SettlementParties11 otherReceivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4
	 * StandingSettlementInstruction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Receiving parties, other than the buyer, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction4.mmObject();
			isDerived = false;
			xmlTag = "OthrRcvgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReceivingSettlementParties";
			definition = "Receiving parties, other than the buyer, needed for deriving the standing settlement instruction (for example, depository) or provided for information purposes (for example, instructing party settlement chain).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties11.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingSettlementInstruction4.mmSettlementStandingInstructionDatabase, com.tools20022.repository.msg.StandingSettlementInstruction4.mmCounterparty,
						com.tools20022.repository.msg.StandingSettlementInstruction4.mmVendor, com.tools20022.repository.msg.StandingSettlementInstruction4.mmOtherDeliveringSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction4.mmOtherReceivingSettlementParties);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionConfirmationV02.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionConfirmationV03.mmStandingSettlementInstructionDetails,
						SecuritiesSettlementTransactionConfirmationV04.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionInstructionV02.mmStandingSettlementInstructionDetails,
						SecuritiesSettlementTransactionInstructionV03.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionInstructionV04.mmStandingSettlementInstructionDetails,
						SecuritiesSettlementTransactionInstructionV05.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionConfirmationV05.mmStandingSettlementInstructionDetails);
				trace_lazy = () -> StandingSettlementInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintVendorPresenceRule.forStandingSettlementInstruction4);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "StandingSettlementInstruction4";
				definition = "Details of the standing settlement instruction to be applied.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementStandingInstructionDatabase1Choice getSettlementStandingInstructionDatabase() {
		return settlementStandingInstructionDatabase;
	}

	public StandingSettlementInstruction4 setSettlementStandingInstructionDatabase(SettlementStandingInstructionDatabase1Choice settlementStandingInstructionDatabase) {
		this.settlementStandingInstructionDatabase = Objects.requireNonNull(settlementStandingInstructionDatabase);
		return this;
	}

	public Counterparty4Choice getCounterparty() {
		return counterparty;
	}

	public StandingSettlementInstruction4 setCounterparty(Counterparty4Choice counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}

	public Optional<PartyIdentification43Choice> getVendor() {
		return vendor == null ? Optional.empty() : Optional.of(vendor);
	}

	public StandingSettlementInstruction4 setVendor(PartyIdentification43Choice vendor) {
		this.vendor = vendor;
		return this;
	}

	public Optional<SettlementParties11> getOtherDeliveringSettlementParties() {
		return otherDeliveringSettlementParties == null ? Optional.empty() : Optional.of(otherDeliveringSettlementParties);
	}

	public StandingSettlementInstruction4 setOtherDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties11 otherDeliveringSettlementParties) {
		this.otherDeliveringSettlementParties = otherDeliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties11> getOtherReceivingSettlementParties() {
		return otherReceivingSettlementParties == null ? Optional.empty() : Optional.of(otherReceivingSettlementParties);
	}

	public StandingSettlementInstruction4 setOtherReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties11 otherReceivingSettlementParties) {
		this.otherReceivingSettlementParties = otherReceivingSettlementParties;
		return this;
	}
}