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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BalanceFormat10Choice;
import com.tools20022.repository.choice.BalanceFormat7Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TotalEligibleBalanceFormat9;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Eligible and not eligible balance of securities for a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmConfirmedBalance
 * CorporateActionBalanceDetails35.mmConfirmedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmTotalEligibleBalance
 * CorporateActionBalanceDetails35.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmBlockedBalance
 * CorporateActionBalanceDetails35.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmBorrowedBalance
 * CorporateActionBalanceDetails35.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmCollateralInBalance
 * CorporateActionBalanceDetails35.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmCollateralOutBalance
 * CorporateActionBalanceDetails35.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmOnLoanBalance
 * CorporateActionBalanceDetails35.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails35.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmPendingReceiptBalance
 * CorporateActionBalanceDetails35.mmPendingReceiptBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails35.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmSettlementPositionBalance
 * CorporateActionBalanceDetails35.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmStreetPositionBalance
 * CorporateActionBalanceDetails35.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails35.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmInTransshipmentBalance
 * CorporateActionBalanceDetails35.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmRegisteredBalance
 * CorporateActionBalanceDetails35.mmRegisteredBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmAffectedBalance
 * CorporateActionBalanceDetails35.mmAffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmUnaffectedBalance
 * CorporateActionBalanceDetails35.mmUnaffectedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails35
 * ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails35
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionBalanceDetails35"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionBalanceDetails35", propOrder = {"confirmedBalance", "totalEligibleBalance", "blockedBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance",
		"pendingReceiptBalance", "outForRegistrationBalance", "settlementPositionBalance", "streetPositionBalance", "tradeDatePositionBalance", "inTransshipmentBalance", "registeredBalance", "affectedBalance", "unaffectedBalance"})
public class CorporateActionBalanceDetails35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ConfdBal", required = true)
	protected BalanceFormat7Choice confirmedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::CONB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance to which the payment applies (less or equal to the total eligible balance)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, BalanceFormat7Choice> mmConfirmedBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, BalanceFormat7Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "ConfdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::CONB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmedBalance";
			definition = "Balance to which the payment applies (less or equal to the total eligible balance).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public BalanceFormat7Choice getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getConfirmedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, BalanceFormat7Choice value) {
			obj.setConfirmedBalance(value);
		}
	};
	@XmlElement(name = "TtlElgblBal")
	protected TotalEligibleBalanceFormat9 totalEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9
	 * TotalEligibleBalanceFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::ELIG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<TotalEligibleBalanceFormat9>> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<TotalEligibleBalanceFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TotalEligibleBalanceFormat9.mmObject();
		}

		@Override
		public Optional<TotalEligibleBalanceFormat9> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<TotalEligibleBalanceFormat9> value) {
			obj.setTotalEligibleBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckdBal")
	protected BalanceFormat7Choice blockedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BLOK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are blocked."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmBlockedBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "BlckdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedBalance";
			definition = "Balance of financial instruments that are blocked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getBlockedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setBlockedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwdBal")
	protected BalanceFormat7Choice borrowedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BORR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been borrowed from another party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmBorrowedBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getBorrowedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setBorrowedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollInBal")
	protected BalanceFormat7Choice collateralInBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollInBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmCollateralInBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getCollateralInBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setCollateralInBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollOutBal")
	protected BalanceFormat7Choice collateralOutBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOutBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOutBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmCollateralOutBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getCollateralOutBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setCollateralOutBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OnLnBal")
	protected BalanceFormat7Choice onLoanBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::LOAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoanBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been loaned to a third party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmOnLoanBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Balance of financial instruments that have been loaned to a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getOnLoanBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setOnLoanBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgDlvryBal")
	protected List<BalanceFormat10Choice> pendingDeliveryBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice
	 * BalanceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgDlvryBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, List<BalanceFormat10Choice>> mmPendingDeliveryBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, List<BalanceFormat10Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat10Choice.mmObject();
		}

		@Override
		public List<BalanceFormat10Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getPendingDeliveryBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, List<BalanceFormat10Choice> value) {
			obj.setPendingDeliveryBalance(value);
		}
	};
	@XmlElement(name = "PdgRctBal")
	protected List<BalanceFormat10Choice> pendingReceiptBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice
	 * BalanceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PENR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, List<BalanceFormat10Choice>> mmPendingReceiptBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, List<BalanceFormat10Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat10Choice.mmObject();
		}

		@Override
		public List<BalanceFormat10Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getPendingReceiptBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, List<BalanceFormat10Choice> value) {
			obj.setPendingReceiptBalance(value);
		}
	};
	@XmlElement(name = "OutForRegnBal")
	protected BalanceFormat7Choice outForRegistrationBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutForRegnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::REGO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistrationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmOutForRegistrationBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "OutForRegnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::REGO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistrationBalance";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getOutForRegistrationBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setOutForRegistrationBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPosBal")
	protected List<BalanceFormat10Choice> settlementPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice
	 * BalanceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPosBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities representing only settled transactions; pending transactions not included."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, List<BalanceFormat10Choice>> mmSettlementPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, List<BalanceFormat10Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat10Choice.mmObject();
		}

		@Override
		public List<BalanceFormat10Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getSettlementPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, List<BalanceFormat10Choice> value) {
			obj.setSettlementPositionBalance(value);
		}
	};
	@XmlElement(name = "StrtPosBal")
	protected BalanceFormat7Choice streetPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtPosBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SPOS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that remain registered in the name of the prior beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmStreetPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "StrtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SPOS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPositionBalance";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getStreetPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setStreetPositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtPosBal")
	protected BalanceFormat7Choice tradeDatePositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtPosBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDatePositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmTradeDatePositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "TradDtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getTradeDatePositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setTradeDatePositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InTrnsShipmntBal")
	protected BalanceFormat7Choice inTransshipmentBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InTrnsShipmntBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipmentBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of physical securities that are in the process of being transferred from one depository/agent to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmInTransshipmentBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "InTrnsShipmntBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipmentBalance";
			definition = "Balance of physical securities that are in the process of being transferred from one depository/agent to another.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getInTransshipmentBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setInTransshipmentBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "RegdBal")
	protected BalanceFormat7Choice registeredBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::NOMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmRegisteredBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "RegdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::NOMI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredBalance";
			definition = "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getRegisteredBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setRegisteredBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "AfctdBal")
	protected BalanceFormat7Choice affectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AfctdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::AFFB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has been affected by the process run through the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmAffectedBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "AfctdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::AFFB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedBalance";
			definition = "Balance that has been affected by the process run through the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getAffectedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setAffectedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UafctdBal")
	protected BalanceFormat7Choice unaffectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
	 * CorporateActionBalanceDetails35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UafctdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNAF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnaffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has not been affected by the process run through the event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>> mmUnaffectedBalance = new MMMessageAttribute<CorporateActionBalanceDetails35, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmObject();
			isDerived = false;
			xmlTag = "UafctdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNAF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffectedBalance";
			definition = "Balance that has not been affected by the process run through the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails35 obj) {
			return obj.getUnaffectedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails35 obj, Optional<BalanceFormat7Choice> value) {
			obj.setUnaffectedBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmTotalEligibleBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmBlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmBorrowedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmCollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmCollateralOutBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmOnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmPendingDeliveryBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmPendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmOutForRegistrationBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmSettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmStreetPositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmTradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmInTransshipmentBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmRegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmAffectedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails35.mmUnaffectedBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails35);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails35";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceFormat7Choice getConfirmedBalance() {
		return confirmedBalance;
	}

	public CorporateActionBalanceDetails35 setConfirmedBalance(BalanceFormat7Choice confirmedBalance) {
		this.confirmedBalance = Objects.requireNonNull(confirmedBalance);
		return this;
	}

	public Optional<TotalEligibleBalanceFormat9> getTotalEligibleBalance() {
		return totalEligibleBalance == null ? Optional.empty() : Optional.of(totalEligibleBalance);
	}

	public CorporateActionBalanceDetails35 setTotalEligibleBalance(TotalEligibleBalanceFormat9 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getBlockedBalance() {
		return blockedBalance == null ? Optional.empty() : Optional.of(blockedBalance);
	}

	public CorporateActionBalanceDetails35 setBlockedBalance(BalanceFormat7Choice blockedBalance) {
		this.blockedBalance = blockedBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getBorrowedBalance() {
		return borrowedBalance == null ? Optional.empty() : Optional.of(borrowedBalance);
	}

	public CorporateActionBalanceDetails35 setBorrowedBalance(BalanceFormat7Choice borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getCollateralInBalance() {
		return collateralInBalance == null ? Optional.empty() : Optional.of(collateralInBalance);
	}

	public CorporateActionBalanceDetails35 setCollateralInBalance(BalanceFormat7Choice collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getCollateralOutBalance() {
		return collateralOutBalance == null ? Optional.empty() : Optional.of(collateralOutBalance);
	}

	public CorporateActionBalanceDetails35 setCollateralOutBalance(BalanceFormat7Choice collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getOnLoanBalance() {
		return onLoanBalance == null ? Optional.empty() : Optional.of(onLoanBalance);
	}

	public CorporateActionBalanceDetails35 setOnLoanBalance(BalanceFormat7Choice onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
		return this;
	}

	public List<BalanceFormat10Choice> getPendingDeliveryBalance() {
		return pendingDeliveryBalance == null ? pendingDeliveryBalance = new ArrayList<>() : pendingDeliveryBalance;
	}

	public CorporateActionBalanceDetails35 setPendingDeliveryBalance(List<BalanceFormat10Choice> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = Objects.requireNonNull(pendingDeliveryBalance);
		return this;
	}

	public List<BalanceFormat10Choice> getPendingReceiptBalance() {
		return pendingReceiptBalance == null ? pendingReceiptBalance = new ArrayList<>() : pendingReceiptBalance;
	}

	public CorporateActionBalanceDetails35 setPendingReceiptBalance(List<BalanceFormat10Choice> pendingReceiptBalance) {
		this.pendingReceiptBalance = Objects.requireNonNull(pendingReceiptBalance);
		return this;
	}

	public Optional<BalanceFormat7Choice> getOutForRegistrationBalance() {
		return outForRegistrationBalance == null ? Optional.empty() : Optional.of(outForRegistrationBalance);
	}

	public CorporateActionBalanceDetails35 setOutForRegistrationBalance(BalanceFormat7Choice outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
		return this;
	}

	public List<BalanceFormat10Choice> getSettlementPositionBalance() {
		return settlementPositionBalance == null ? settlementPositionBalance = new ArrayList<>() : settlementPositionBalance;
	}

	public CorporateActionBalanceDetails35 setSettlementPositionBalance(List<BalanceFormat10Choice> settlementPositionBalance) {
		this.settlementPositionBalance = Objects.requireNonNull(settlementPositionBalance);
		return this;
	}

	public Optional<BalanceFormat7Choice> getStreetPositionBalance() {
		return streetPositionBalance == null ? Optional.empty() : Optional.of(streetPositionBalance);
	}

	public CorporateActionBalanceDetails35 setStreetPositionBalance(BalanceFormat7Choice streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getTradeDatePositionBalance() {
		return tradeDatePositionBalance == null ? Optional.empty() : Optional.of(tradeDatePositionBalance);
	}

	public CorporateActionBalanceDetails35 setTradeDatePositionBalance(BalanceFormat7Choice tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getInTransshipmentBalance() {
		return inTransshipmentBalance == null ? Optional.empty() : Optional.of(inTransshipmentBalance);
	}

	public CorporateActionBalanceDetails35 setInTransshipmentBalance(BalanceFormat7Choice inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getRegisteredBalance() {
		return registeredBalance == null ? Optional.empty() : Optional.of(registeredBalance);
	}

	public CorporateActionBalanceDetails35 setRegisteredBalance(BalanceFormat7Choice registeredBalance) {
		this.registeredBalance = registeredBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getAffectedBalance() {
		return affectedBalance == null ? Optional.empty() : Optional.of(affectedBalance);
	}

	public CorporateActionBalanceDetails35 setAffectedBalance(BalanceFormat7Choice affectedBalance) {
		this.affectedBalance = affectedBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getUnaffectedBalance() {
		return unaffectedBalance == null ? Optional.empty() : Optional.of(unaffectedBalance);
	}

	public CorporateActionBalanceDetails35 setUnaffectedBalance(BalanceFormat7Choice unaffectedBalance) {
		this.unaffectedBalance = unaffectedBalance;
		return this;
	}
}