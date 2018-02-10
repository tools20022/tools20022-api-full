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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.PriorityNumeric2Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
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
 * Details of the intra-position movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmPriority
 * IntraPositionDetails25.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmSettlementQuantity
 * IntraPositionDetails25.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmSecuritiesSubBalanceIdentification
 * IntraPositionDetails25.mmSecuritiesSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmSettlementDate
 * IntraPositionDetails25.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmBalanceFrom
 * IntraPositionDetails25.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmBalanceTo
 * IntraPositionDetails25.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25#mmInstructionProcessingAdditionalDetails
 * IntraPositionDetails25.mmInstructionProcessingAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails25
 * ConstraintAdditionalDetailsRule.forIntraPositionDetails25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forIntraPositionDetails25
 * ConstraintCoexistenceQuantityRule.forIntraPositionDetails25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails25
 * ConstraintBalanceFromToRule.forIntraPositionDetails25}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionDetails25"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-position movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionDetails25", propOrder = {"priority", "settlementQuantity", "securitiesSubBalanceIdentification", "settlementDate", "balanceFrom", "balanceTo", "instructionProcessingAdditionalDetails"})
public class IntraPositionDetails25 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prty")
	protected PriorityNumeric2Choice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric2Choice
	 * PriorityNumeric2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmPriority
	 * Obligation.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriority = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Obligation.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails25.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriorityNumeric2Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmQty", required = true)
	protected FinancialInstrumentQuantity15Choice settlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails25.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesSubBalId")
	protected GenericIdentification39 securitiesSubBalanceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification39
	 * GenericIdentification39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a Securities Sub balance Type (e.g. restriction identification etc…)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSubBalanceIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails25.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceIdentification";
			definition = "Number identifying a Securities Sub balance Type (e.g. restriction identification etc…).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification39.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected DateAndDateTimeChoice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the securities are to be moved."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails25.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "BalFr", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown2 balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities are moving."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceFrom = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails25.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities are moving.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2.mmObject();
		}
	};
	@XmlElement(name = "BalTo", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown2 balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the securities are moving."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceTo = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails25.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the securities are moving.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2.mmObject();
		}
	};
	@XmlElement(name = "InstrPrcgAddtlDtls")
	protected RestrictedFINXMax350Text instructionProcessingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails25
	 * IntraPositionDetails25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::SPRO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails25.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::SPRO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionDetails25.mmPriority, com.tools20022.repository.msg.IntraPositionDetails25.mmSettlementQuantity,
						com.tools20022.repository.msg.IntraPositionDetails25.mmSecuritiesSubBalanceIdentification, com.tools20022.repository.msg.IntraPositionDetails25.mmSettlementDate,
						com.tools20022.repository.msg.IntraPositionDetails25.mmBalanceFrom, com.tools20022.repository.msg.IntraPositionDetails25.mmBalanceTo,
						com.tools20022.repository.msg.IntraPositionDetails25.mmInstructionProcessingAdditionalDetails);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails25,
						com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forIntraPositionDetails25, com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails25);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IntraPositionDetails25";
				definition = "Details of the intra-position movement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriorityNumeric2Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public IntraPositionDetails25 setPriority(PriorityNumeric2Choice priority) {
		this.priority = priority;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getSettlementQuantity() {
		return settlementQuantity;
	}

	public IntraPositionDetails25 setSettlementQuantity(FinancialInstrumentQuantity15Choice settlementQuantity) {
		this.settlementQuantity = Objects.requireNonNull(settlementQuantity);
		return this;
	}

	public Optional<GenericIdentification39> getSecuritiesSubBalanceIdentification() {
		return securitiesSubBalanceIdentification == null ? Optional.empty() : Optional.of(securitiesSubBalanceIdentification);
	}

	public IntraPositionDetails25 setSecuritiesSubBalanceIdentification(com.tools20022.repository.msg.GenericIdentification39 securitiesSubBalanceIdentification) {
		this.securitiesSubBalanceIdentification = securitiesSubBalanceIdentification;
		return this;
	}

	public DateAndDateTimeChoice getSettlementDate() {
		return settlementDate;
	}

	public IntraPositionDetails25 setSettlementDate(DateAndDateTimeChoice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown2 getBalanceFrom() {
		return balanceFrom;
	}

	public IntraPositionDetails25 setBalanceFrom(com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2 balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown2 getBalanceTo() {
		return balanceTo;
	}

	public IntraPositionDetails25 setBalanceTo(com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown2 balanceTo) {
		this.balanceTo = Objects.requireNonNull(balanceTo);
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(instructionProcessingAdditionalDetails);
	}

	public IntraPositionDetails25 setInstructionProcessingAdditionalDetails(RestrictedFINXMax350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
		return this;
	}
}