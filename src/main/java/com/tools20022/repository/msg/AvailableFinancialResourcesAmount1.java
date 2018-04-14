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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.CCPAvailableFinancialResourcesReportV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Construct used by a central counterparty to define the size of the aggregate
 * quantum of resources available from a clearing member.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1#mmTotalInitialMargin
 * AvailableFinancialResourcesAmount1.mmTotalInitialMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1#mmTotalPrefundedDefaultFund
 * AvailableFinancialResourcesAmount1.mmTotalPrefundedDefaultFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1#mmCCPSkinInTheGame
 * AvailableFinancialResourcesAmount1.mmCCPSkinInTheGame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1#mmOtherDefaultFundContribution
 * AvailableFinancialResourcesAmount1.mmOtherDefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1#mmUnfundedMemberCommitment
 * AvailableFinancialResourcesAmount1.mmUnfundedMemberCommitment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1#mmUnfundedThirdPartyCommitment
 * AvailableFinancialResourcesAmount1.mmUnfundedThirdPartyCommitment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPAvailableFinancialResourcesReportV01#mmAvailableFinancialResourcesAmount
 * CCPAvailableFinancialResourcesReportV01.mmAvailableFinancialResourcesAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AvailableFinancialResourcesAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Construct used by a central counterparty to define the size of the aggregate quantum of resources available from a clearing member."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AvailableFinancialResourcesAmount1", propOrder = {"totalInitialMargin", "totalPrefundedDefaultFund", "cCPSkinInTheGame", "otherDefaultFundContribution", "unfundedMemberCommitment", "unfundedThirdPartyCommitment"})
public class AvailableFinancialResourcesAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlInitlMrgn", required = true)
	protected ActiveCurrencyAndAmount totalInitialMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
	 * MarginCall.mmInitialMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1
	 * AvailableFinancialResourcesAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlInitlMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInitialMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the initial margin (IM) requirement for all members at the last business day of the month.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount> mmTotalInitialMargin = new MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmInitialMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmObject();
			isDerived = false;
			xmlTag = "TtlInitlMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInitialMargin";
			definition = "Total value of the initial margin (IM) requirement for all members at the last business day of the month.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AvailableFinancialResourcesAmount1 obj) {
			return obj.getTotalInitialMargin();
		}

		@Override
		public void setValue(AvailableFinancialResourcesAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalInitialMargin(value);
		}
	};
	@XmlElement(name = "TtlPrfnddDfltFnd", required = true)
	protected ActiveCurrencyAndAmount totalPrefundedDefaultFund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1
	 * AvailableFinancialResourcesAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPrfnddDfltFnd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPrefundedDefaultFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the clearing member pre-funded default fund, excluding pre-funded contributions to the default fund from the CCP.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount> mmTotalPrefundedDefaultFund = new MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmObject();
			isDerived = false;
			xmlTag = "TtlPrfnddDfltFnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPrefundedDefaultFund";
			definition = "Total value of the clearing member pre-funded default fund, excluding pre-funded contributions to the default fund from the CCP.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AvailableFinancialResourcesAmount1 obj) {
			return obj.getTotalPrefundedDefaultFund();
		}

		@Override
		public void setValue(AvailableFinancialResourcesAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalPrefundedDefaultFund(value);
		}
	};
	@XmlElement(name = "CCPSkinInTheGame", required = true)
	protected ActiveCurrencyAndAmount cCPSkinInTheGame;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1
	 * AvailableFinancialResourcesAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPSkinInTheGame"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPSkinInTheGame"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the CCP’s own contribution to the default waterfall junior to the pre-funded default fund contributions of the non-defaulting clearing members.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount> mmCCPSkinInTheGame = new MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmObject();
			isDerived = false;
			xmlTag = "CCPSkinInTheGame";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPSkinInTheGame";
			definition = "Value of the CCP’s own contribution to the default waterfall junior to the pre-funded default fund contributions of the non-defaulting clearing members.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AvailableFinancialResourcesAmount1 obj) {
			return obj.getCCPSkinInTheGame();
		}

		@Override
		public void setValue(AvailableFinancialResourcesAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setCCPSkinInTheGame(value);
		}
	};
	@XmlElement(name = "OthrDfltFndCntrbtn", required = true)
	protected ActiveCurrencyAndAmount otherDefaultFundContribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1
	 * AvailableFinancialResourcesAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDfltFndCntrbtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDefaultFundContribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of other contributions to the pre-funded default fund, not received from clearing members, including any contribution from the CCP that is pari-passu with the default fund contributions of the non-defaulting clearing members.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount> mmOtherDefaultFundContribution = new MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmObject();
			isDerived = false;
			xmlTag = "OthrDfltFndCntrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDefaultFundContribution";
			definition = "Total value of other contributions to the pre-funded default fund, not received from clearing members, including any contribution from the CCP that is pari-passu with the default fund contributions of the non-defaulting clearing members.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AvailableFinancialResourcesAmount1 obj) {
			return obj.getOtherDefaultFundContribution();
		}

		@Override
		public void setValue(AvailableFinancialResourcesAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setOtherDefaultFundContribution(value);
		}
	};
	@XmlElement(name = "UfnddMmbCmmtmnt", required = true)
	protected ActiveCurrencyAndAmount unfundedMemberCommitment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1
	 * AvailableFinancialResourcesAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfnddMmbCmmtmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfundedMemberCommitment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of all legally‐bound commitments for members to provide additional resources to available to mutualise losses on exhaustion of the default fund.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount> mmUnfundedMemberCommitment = new MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmObject();
			isDerived = false;
			xmlTag = "UfnddMmbCmmtmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfundedMemberCommitment";
			definition = "Total value of all legally‐bound commitments for members to provide additional resources to available to mutualise losses on exhaustion of the default fund.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AvailableFinancialResourcesAmount1 obj) {
			return obj.getUnfundedMemberCommitment();
		}

		@Override
		public void setValue(AvailableFinancialResourcesAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setUnfundedMemberCommitment(value);
		}
	};
	@XmlElement(name = "UfnddThrdPtyCmmtmnt", required = true)
	protected ActiveCurrencyAndAmount unfundedThirdPartyCommitment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AvailableFinancialResourcesAmount1
	 * AvailableFinancialResourcesAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfnddThrdPtyCmmtmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfundedThirdPartyCommitment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of any third‐party commitments to provide additional resources to absorb losses, for example, from insurers.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount> mmUnfundedThirdPartyCommitment = new MMMessageAttribute<AvailableFinancialResourcesAmount1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmObject();
			isDerived = false;
			xmlTag = "UfnddThrdPtyCmmtmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfundedThirdPartyCommitment";
			definition = "Total value of any third‐party commitments to provide additional resources to absorb losses, for example, from insurers.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AvailableFinancialResourcesAmount1 obj) {
			return obj.getUnfundedThirdPartyCommitment();
		}

		@Override
		public void setValue(AvailableFinancialResourcesAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setUnfundedThirdPartyCommitment(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmTotalInitialMargin, com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmTotalPrefundedDefaultFund,
						com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmCCPSkinInTheGame, com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmOtherDefaultFundContribution,
						com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmUnfundedMemberCommitment, com.tools20022.repository.msg.AvailableFinancialResourcesAmount1.mmUnfundedThirdPartyCommitment);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPAvailableFinancialResourcesReportV01.mmAvailableFinancialResourcesAmount);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AvailableFinancialResourcesAmount1";
				definition = "Construct used by a central counterparty to define the size of the aggregate quantum of resources available from a clearing member.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getTotalInitialMargin() {
		return totalInitialMargin;
	}

	public AvailableFinancialResourcesAmount1 setTotalInitialMargin(ActiveCurrencyAndAmount totalInitialMargin) {
		this.totalInitialMargin = Objects.requireNonNull(totalInitialMargin);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalPrefundedDefaultFund() {
		return totalPrefundedDefaultFund;
	}

	public AvailableFinancialResourcesAmount1 setTotalPrefundedDefaultFund(ActiveCurrencyAndAmount totalPrefundedDefaultFund) {
		this.totalPrefundedDefaultFund = Objects.requireNonNull(totalPrefundedDefaultFund);
		return this;
	}

	public ActiveCurrencyAndAmount getCCPSkinInTheGame() {
		return cCPSkinInTheGame;
	}

	public AvailableFinancialResourcesAmount1 setCCPSkinInTheGame(ActiveCurrencyAndAmount cCPSkinInTheGame) {
		this.cCPSkinInTheGame = Objects.requireNonNull(cCPSkinInTheGame);
		return this;
	}

	public ActiveCurrencyAndAmount getOtherDefaultFundContribution() {
		return otherDefaultFundContribution;
	}

	public AvailableFinancialResourcesAmount1 setOtherDefaultFundContribution(ActiveCurrencyAndAmount otherDefaultFundContribution) {
		this.otherDefaultFundContribution = Objects.requireNonNull(otherDefaultFundContribution);
		return this;
	}

	public ActiveCurrencyAndAmount getUnfundedMemberCommitment() {
		return unfundedMemberCommitment;
	}

	public AvailableFinancialResourcesAmount1 setUnfundedMemberCommitment(ActiveCurrencyAndAmount unfundedMemberCommitment) {
		this.unfundedMemberCommitment = Objects.requireNonNull(unfundedMemberCommitment);
		return this;
	}

	public ActiveCurrencyAndAmount getUnfundedThirdPartyCommitment() {
		return unfundedThirdPartyCommitment;
	}

	public AvailableFinancialResourcesAmount1 setUnfundedThirdPartyCommitment(ActiveCurrencyAndAmount unfundedThirdPartyCommitment) {
		this.unfundedThirdPartyCommitment = Objects.requireNonNull(unfundedThirdPartyCommitment);
		return this;
	}
}