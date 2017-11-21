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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.AgentCAElectionAdviceV01;
import com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01;
import com.tools20022.repository.choice.CorporateActionOption1FormatChoice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about a corporate action election.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmAccountDetails
 * CorporateActionElection3.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionType
 * CorporateActionElection3.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmOptionNumber
 * CorporateActionElection3.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmInstructedUnderlyingSecuritiesQuantity
 * CorporateActionElection3.mmInstructedUnderlyingSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmInstructedSecuritiesQuantityToReceive
 * CorporateActionElection3.mmInstructedSecuritiesQuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmProposedRate
 * CorporateActionElection3.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmCashMovementDetails
 * CorporateActionElection3.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmSecuritiesMovementDetails
 * CorporateActionElection3.mmSecuritiesMovementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
 * CorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmElectionDetails
 * AgentCAElectionAdviceV01.mmElectionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#mmElectionDetails
 * AgentCAElectionCancellationRequestV01.mmElectionDetails}</li>
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
 * "CorporateActionElection3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about a corporate action election."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionElection3", propOrder = {"accountDetails", "optionType", "optionNumber", "instructedUnderlyingSecuritiesQuantity", "instructedSecuritiesQuantityToReceive", "proposedRate", "cashMovementDetails",
		"securitiesMovementDetails"})
public class CorporateActionElection3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesAccount7 accountDetails;
	/**
	 * Provides information about the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount7
	 * SecuritiesAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmSecuritiesAccount;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Provides information about the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount7.mmObject();
		}
	};
	protected CorporateActionOption1FormatChoice optionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
	 * CorporateActionOption1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}
	};
	protected Exact3NumericText optionNumber;
	/**
	 * Number identifying the available corporate action options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice instructedUnderlyingSecuritiesQuantity;
	/**
	 * Quantity of underlying securities to which this instruction applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
	 * CorporateActionElection.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdUndrlygSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedUnderlyingSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of underlying securities to which this instruction applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedUnderlyingSecuritiesQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmQuantity;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "InstdUndrlygSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedUnderlyingSecuritiesQuantity";
			definition = "Quantity of underlying securities to which this instruction applies.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice instructedSecuritiesQuantityToReceive;
	/**
	 * Quantity of the benefits that the account owner wants to receive, eg, as
	 * a result of dividend reinvestment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
	 * CorporateActionElection.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdSctiesQtyToRcv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedSecuritiesQuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the benefits that the account owner wants to receive, eg, as a result of dividend reinvestment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedSecuritiesQuantityToReceive = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmQuantity;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "InstdSctiesQtyToRcv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedSecuritiesQuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, eg, as a result of dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected PercentageRate proposedRate;
	/**
	 * Rate proposed in a remarketing of variable rate notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProposedRate
	 * BiddingConditions.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProposedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProposedRate;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "PropsdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionCashMovements2> cashMovementDetails;
	/**
	 * Provides information about the cash movement resulting from the election
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2
	 * CorporateActionCashMovements2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
	 * BookEntry.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the cash movement resulting from the election instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashMovementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BookEntry.mmCashEntry;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement resulting from the election instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionCashMovements2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionSecuritiesMovement2> securitiesMovementDetails;
	/**
	 * Provides information about the securities movement resulting from the
	 * election instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2
	 * CorporateActionSecuritiesMovement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmSecuritiesTransfer
	 * SecuritiesDeliveryObligation.mmSecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3
	 * CorporateActionElection3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the securities movement resulting from the election instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesMovementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmSecuritiesTransfer;
			componentContext_lazy = () -> CorporateActionElection3.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement resulting from the election instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionSecuritiesMovement2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionElection3.mmAccountDetails, CorporateActionElection3.mmOptionType, CorporateActionElection3.mmOptionNumber,
						CorporateActionElection3.mmInstructedUnderlyingSecuritiesQuantity, CorporateActionElection3.mmInstructedSecuritiesQuantityToReceive, CorporateActionElection3.mmProposedRate,
						CorporateActionElection3.mmCashMovementDetails, CorporateActionElection3.mmSecuritiesMovementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAElectionAdviceV01.mmElectionDetails, AgentCAElectionCancellationRequestV01.mmElectionDetails);
				trace_lazy = () -> CorporateActionElection.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionElection3";
				definition = "Provides information about a corporate action election.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctDtls")
	public SecuritiesAccount7 getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(com.tools20022.repository.msg.SecuritiesAccount7 accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "OptnTp")
	public CorporateActionOption1FormatChoice getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOption1FormatChoice optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "OptnNb")
	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
	}

	@XmlElement(name = "InstdUndrlygSctiesQty")
	public UnitOrFaceAmount1Choice getInstructedUnderlyingSecuritiesQuantity() {
		return instructedUnderlyingSecuritiesQuantity;
	}

	public void setInstructedUnderlyingSecuritiesQuantity(UnitOrFaceAmount1Choice instructedUnderlyingSecuritiesQuantity) {
		this.instructedUnderlyingSecuritiesQuantity = instructedUnderlyingSecuritiesQuantity;
	}

	@XmlElement(name = "InstdSctiesQtyToRcv")
	public UnitOrFaceAmount1Choice getInstructedSecuritiesQuantityToReceive() {
		return instructedSecuritiesQuantityToReceive;
	}

	public void setInstructedSecuritiesQuantityToReceive(UnitOrFaceAmount1Choice instructedSecuritiesQuantityToReceive) {
		this.instructedSecuritiesQuantityToReceive = instructedSecuritiesQuantityToReceive;
	}

	@XmlElement(name = "PropsdRate")
	public PercentageRate getProposedRate() {
		return proposedRate;
	}

	public void setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
	}

	@XmlElement(name = "CshMvmntDtls")
	public List<CorporateActionCashMovements2> getCashMovementDetails() {
		return cashMovementDetails;
	}

	public void setCashMovementDetails(List<com.tools20022.repository.msg.CorporateActionCashMovements2> cashMovementDetails) {
		this.cashMovementDetails = cashMovementDetails;
	}

	@XmlElement(name = "SctiesMvmntDtls")
	public List<CorporateActionSecuritiesMovement2> getSecuritiesMovementDetails() {
		return securitiesMovementDetails;
	}

	public void setSecuritiesMovementDetails(List<com.tools20022.repository.msg.CorporateActionSecuritiesMovement2> securitiesMovementDetails) {
		this.securitiesMovementDetails = securitiesMovementDetails;
	}
}