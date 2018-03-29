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
import com.tools20022.repository.choice.BalanceFormat7Choice;
import com.tools20022.repository.choice.Quantity22Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmTotalEligibleBalance
 * CorporateActionBalanceDetails34.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmBlockedBalance
 * CorporateActionBalanceDetails34.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmBorrowedBalance
 * CorporateActionBalanceDetails34.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmCollateralInBalance
 * CorporateActionBalanceDetails34.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmCollateralOutBalance
 * CorporateActionBalanceDetails34.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmOnLoanBalance
 * CorporateActionBalanceDetails34.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails34.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmPendingReceiptBalance
 * CorporateActionBalanceDetails34.mmPendingReceiptBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails34.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmSettlementPositionBalance
 * CorporateActionBalanceDetails34.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmStreetPositionBalance
 * CorporateActionBalanceDetails34.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails34.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmInTransshipmentBalance
 * CorporateActionBalanceDetails34.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmRegisteredBalance
 * CorporateActionBalanceDetails34.mmRegisteredBalance}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionBalanceDetails34"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionBalanceDetails34", propOrder = {"totalEligibleBalance", "blockedBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance", "pendingReceiptBalance",
		"outForRegistrationBalance", "settlementPositionBalance", "streetPositionBalance", "tradeDatePositionBalance", "inTransshipmentBalance", "registeredBalance"})
public class CorporateActionBalanceDetails34 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal")
	protected Quantity22Choice totalEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity22Choice
	 * Quantity22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<Quantity22Choice>> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<Quantity22Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity22Choice.mmObject();
		}

		@Override
		public Optional<Quantity22Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<Quantity22Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmBlockedBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getBlockedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmBorrowedBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getBorrowedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmCollateralInBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getCollateralInBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmCollateralOutBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getCollateralOutBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmOnLoanBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getOnLoanBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
			obj.setOnLoanBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgDlvryBal")
	protected List<BalanceFormat7Choice> pendingDeliveryBalance;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, List<BalanceFormat7Choice>> mmPendingDeliveryBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, List<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public List<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getPendingDeliveryBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, List<BalanceFormat7Choice> value) {
			obj.setPendingDeliveryBalance(value);
		}
	};
	@XmlElement(name = "PdgRctBal")
	protected List<BalanceFormat7Choice> pendingReceiptBalance;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, List<BalanceFormat7Choice>> mmPendingReceiptBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, List<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public List<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getPendingReceiptBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, List<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmOutForRegistrationBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getOutForRegistrationBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
			obj.setOutForRegistrationBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPosBal")
	protected BalanceFormat7Choice settlementPositionBalance;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmSettlementPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getSettlementPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
			obj.setSettlementPositionBalance(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmStreetPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getStreetPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmTradeDatePositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getTradeDatePositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmInTransshipmentBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getInTransshipmentBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
	 * CorporateActionBalanceDetails34}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>> mmRegisteredBalance = new MMMessageAttribute<CorporateActionBalanceDetails34, Optional<BalanceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmObject();
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
		public Optional<BalanceFormat7Choice> getValue(CorporateActionBalanceDetails34 obj) {
			return obj.getRegisteredBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails34 obj, Optional<BalanceFormat7Choice> value) {
			obj.setRegisteredBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmBlockedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmCollateralInBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmOnLoanBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmPendingReceiptBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmSettlementPositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmTradeDatePositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.mmRegisteredBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails34";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Quantity22Choice> getTotalEligibleBalance() {
		return totalEligibleBalance == null ? Optional.empty() : Optional.of(totalEligibleBalance);
	}

	public CorporateActionBalanceDetails34 setTotalEligibleBalance(Quantity22Choice totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getBlockedBalance() {
		return blockedBalance == null ? Optional.empty() : Optional.of(blockedBalance);
	}

	public CorporateActionBalanceDetails34 setBlockedBalance(BalanceFormat7Choice blockedBalance) {
		this.blockedBalance = blockedBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getBorrowedBalance() {
		return borrowedBalance == null ? Optional.empty() : Optional.of(borrowedBalance);
	}

	public CorporateActionBalanceDetails34 setBorrowedBalance(BalanceFormat7Choice borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getCollateralInBalance() {
		return collateralInBalance == null ? Optional.empty() : Optional.of(collateralInBalance);
	}

	public CorporateActionBalanceDetails34 setCollateralInBalance(BalanceFormat7Choice collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getCollateralOutBalance() {
		return collateralOutBalance == null ? Optional.empty() : Optional.of(collateralOutBalance);
	}

	public CorporateActionBalanceDetails34 setCollateralOutBalance(BalanceFormat7Choice collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getOnLoanBalance() {
		return onLoanBalance == null ? Optional.empty() : Optional.of(onLoanBalance);
	}

	public CorporateActionBalanceDetails34 setOnLoanBalance(BalanceFormat7Choice onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
		return this;
	}

	public List<BalanceFormat7Choice> getPendingDeliveryBalance() {
		return pendingDeliveryBalance == null ? pendingDeliveryBalance = new ArrayList<>() : pendingDeliveryBalance;
	}

	public CorporateActionBalanceDetails34 setPendingDeliveryBalance(List<BalanceFormat7Choice> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = Objects.requireNonNull(pendingDeliveryBalance);
		return this;
	}

	public List<BalanceFormat7Choice> getPendingReceiptBalance() {
		return pendingReceiptBalance == null ? pendingReceiptBalance = new ArrayList<>() : pendingReceiptBalance;
	}

	public CorporateActionBalanceDetails34 setPendingReceiptBalance(List<BalanceFormat7Choice> pendingReceiptBalance) {
		this.pendingReceiptBalance = Objects.requireNonNull(pendingReceiptBalance);
		return this;
	}

	public Optional<BalanceFormat7Choice> getOutForRegistrationBalance() {
		return outForRegistrationBalance == null ? Optional.empty() : Optional.of(outForRegistrationBalance);
	}

	public CorporateActionBalanceDetails34 setOutForRegistrationBalance(BalanceFormat7Choice outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getSettlementPositionBalance() {
		return settlementPositionBalance == null ? Optional.empty() : Optional.of(settlementPositionBalance);
	}

	public CorporateActionBalanceDetails34 setSettlementPositionBalance(BalanceFormat7Choice settlementPositionBalance) {
		this.settlementPositionBalance = settlementPositionBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getStreetPositionBalance() {
		return streetPositionBalance == null ? Optional.empty() : Optional.of(streetPositionBalance);
	}

	public CorporateActionBalanceDetails34 setStreetPositionBalance(BalanceFormat7Choice streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getTradeDatePositionBalance() {
		return tradeDatePositionBalance == null ? Optional.empty() : Optional.of(tradeDatePositionBalance);
	}

	public CorporateActionBalanceDetails34 setTradeDatePositionBalance(BalanceFormat7Choice tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getInTransshipmentBalance() {
		return inTransshipmentBalance == null ? Optional.empty() : Optional.of(inTransshipmentBalance);
	}

	public CorporateActionBalanceDetails34 setInTransshipmentBalance(BalanceFormat7Choice inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
		return this;
	}

	public Optional<BalanceFormat7Choice> getRegisteredBalance() {
		return registeredBalance == null ? Optional.empty() : Optional.of(registeredBalance);
	}

	public CorporateActionBalanceDetails34 setRegisteredBalance(BalanceFormat7Choice registeredBalance) {
		this.registeredBalance = registeredBalance;
		return this;
	}
}