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
import com.tools20022.repository.choice.BalanceFormat7Choice;
import com.tools20022.repository.choice.Quantity22Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstructedBalanceDetails6;
import com.tools20022.repository.msg.PendingBalance4;
import com.tools20022.repository.msg.SignedQuantityFormat9;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTotalEligibleBalance
 * CorporateActionBalanceDetails33.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmUninstructedBalance
 * CorporateActionBalanceDetails33.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTotalInstructedBalanceDetails
 * CorporateActionBalanceDetails33.mmTotalInstructedBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmBlockedBalance
 * CorporateActionBalanceDetails33.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmBorrowedBalance
 * CorporateActionBalanceDetails33.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmCollateralInBalance
 * CorporateActionBalanceDetails33.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmCollateralOutBalance
 * CorporateActionBalanceDetails33.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmOnLoanBalance
 * CorporateActionBalanceDetails33.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails33.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmSettlementPositionBalance
 * CorporateActionBalanceDetails33.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmStreetPositionBalance
 * CorporateActionBalanceDetails33.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails33.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmInTransshipmentBalance
 * CorporateActionBalanceDetails33.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmRegisteredBalance
 * CorporateActionBalanceDetails33.mmRegisteredBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmObligatedBalance
 * CorporateActionBalanceDetails33.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails33.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmPendingReceiptBalance
 * CorporateActionBalanceDetails33.mmPendingReceiptBalance}</li>
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
 * "CorporateActionBalanceDetails33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionBalanceDetails33", propOrder = {"totalEligibleBalance", "uninstructedBalance", "totalInstructedBalanceDetails", "blockedBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance",
		"onLoanBalance", "outForRegistrationBalance", "settlementPositionBalance", "streetPositionBalance", "tradeDatePositionBalance", "inTransshipmentBalance", "registeredBalance", "obligatedBalance", "pendingDeliveryBalance",
		"pendingReceiptBalance"})
public class CorporateActionBalanceDetails33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Quantity22Choice> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Quantity22Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity22Choice.mmObject();
		}

		@Override
		public Quantity22Choice getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Quantity22Choice value) {
			obj.setTotalEligibleBalance(value);
		}
	};
	@XmlElement(name = "UinstdBal", required = true)
	protected BalanceFormat7Choice uninstructedBalance;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UinstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, BalanceFormat7Choice> mmUninstructedBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, BalanceFormat7Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Quantity of securities in the sub-balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public BalanceFormat7Choice getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getUninstructedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, BalanceFormat7Choice value) {
			obj.setUninstructedBalance(value);
		}
	};
	@XmlElement(name = "TtlInstdBalDtls", required = true)
	protected InstructedBalanceDetails6 totalInstructedBalanceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails6
	 * InstructedBalanceDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlInstdBalDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInstructedBalanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the total instructed balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceDetails33, InstructedBalanceDetails6> mmTotalInstructedBalanceDetails = new MMMessageAssociationEnd<CorporateActionBalanceDetails33, InstructedBalanceDetails6>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "TtlInstdBalDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInstructedBalanceDetails";
			definition = "Provides information about the total instructed balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructedBalanceDetails6.mmObject();
		}

		@Override
		public InstructedBalanceDetails6 getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getTotalInstructedBalanceDetails();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, InstructedBalanceDetails6 value) {
			obj.setTotalInstructedBalanceDetails(value);
		}
	};
	@XmlElement(name = "BlckdBal")
	protected SignedQuantityFormat9 blockedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmBlockedBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "BlckdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedBalance";
			definition = "Balance of financial instruments that are blocked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getBlockedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setBlockedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwdBal")
	protected SignedQuantityFormat9 borrowedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmBorrowedBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getBorrowedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setBorrowedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollInBal")
	protected SignedQuantityFormat9 collateralInBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmCollateralInBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getCollateralInBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setCollateralInBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollOutBal")
	protected SignedQuantityFormat9 collateralOutBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmCollateralOutBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getCollateralOutBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setCollateralOutBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OnLnBal")
	protected SignedQuantityFormat9 onLoanBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmOnLoanBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Balance of financial instruments that have been loaned to a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getOnLoanBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOnLoanBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OutForRegnBal")
	protected SignedQuantityFormat9 outForRegistrationBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmOutForRegistrationBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "OutForRegnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::REGO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistrationBalance";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getOutForRegistrationBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOutForRegistrationBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPosBal")
	protected SignedQuantityFormat9 settlementPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmSettlementPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getSettlementPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setSettlementPositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "StrtPosBal")
	protected SignedQuantityFormat9 streetPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmStreetPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "StrtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SPOS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPositionBalance";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getStreetPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setStreetPositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtPosBal")
	protected SignedQuantityFormat9 tradeDatePositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmTradeDatePositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "TradDtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getTradeDatePositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setTradeDatePositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InTrnsShipmntBal")
	protected SignedQuantityFormat9 inTransshipmentBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmInTransshipmentBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "InTrnsShipmntBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipmentBalance";
			definition = "Balance of physical securities that are in the process of being transferred from one depository/agent to another.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getInTransshipmentBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setInTransshipmentBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "RegdBal")
	protected SignedQuantityFormat9 registeredBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmRegisteredBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "RegdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::NOMI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredBalance";
			definition = "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getRegisteredBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setRegisteredBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OblgtdBal")
	protected SignedQuantityFormat9 obligatedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:OBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligatedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>> mmObligatedBalance = new MMMessageAttribute<CorporateActionBalanceDetails33, Optional<SignedQuantityFormat9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:OBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getObligatedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, Optional<SignedQuantityFormat9> value) {
			obj.setObligatedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgDlvryBal")
	protected List<PendingBalance4> pendingDeliveryBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingBalance4
	 * PendingBalance4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAssociationEnd<CorporateActionBalanceDetails33, List<PendingBalance4>> mmPendingDeliveryBalance = new MMMessageAssociationEnd<CorporateActionBalanceDetails33, List<PendingBalance4>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingBalance4.mmObject();
		}

		@Override
		public List<PendingBalance4> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getPendingDeliveryBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, List<PendingBalance4> value) {
			obj.setPendingDeliveryBalance(value);
		}
	};
	@XmlElement(name = "PdgRctBal")
	protected List<PendingBalance4> pendingReceiptBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingBalance4
	 * PendingBalance4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
	 * CorporateActionBalanceDetails33}</li>
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
	public static final MMMessageAssociationEnd<CorporateActionBalanceDetails33, List<PendingBalance4>> mmPendingReceiptBalance = new MMMessageAssociationEnd<CorporateActionBalanceDetails33, List<PendingBalance4>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingBalance4.mmObject();
		}

		@Override
		public List<PendingBalance4> getValue(CorporateActionBalanceDetails33 obj) {
			return obj.getPendingReceiptBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails33 obj, List<PendingBalance4> value) {
			obj.setPendingReceiptBalance(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmUninstructedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmTotalInstructedBalanceDetails, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmBlockedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmCollateralInBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmOnLoanBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmSettlementPositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmTradeDatePositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmRegisteredBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmPendingDeliveryBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails33.mmPendingReceiptBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails33";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public Quantity22Choice getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public CorporateActionBalanceDetails33 setTotalEligibleBalance(Quantity22Choice totalEligibleBalance) {
		this.totalEligibleBalance = Objects.requireNonNull(totalEligibleBalance);
		return this;
	}

	public BalanceFormat7Choice getUninstructedBalance() {
		return uninstructedBalance;
	}

	public CorporateActionBalanceDetails33 setUninstructedBalance(BalanceFormat7Choice uninstructedBalance) {
		this.uninstructedBalance = Objects.requireNonNull(uninstructedBalance);
		return this;
	}

	public InstructedBalanceDetails6 getTotalInstructedBalanceDetails() {
		return totalInstructedBalanceDetails;
	}

	public CorporateActionBalanceDetails33 setTotalInstructedBalanceDetails(InstructedBalanceDetails6 totalInstructedBalanceDetails) {
		this.totalInstructedBalanceDetails = Objects.requireNonNull(totalInstructedBalanceDetails);
		return this;
	}

	public Optional<SignedQuantityFormat9> getBlockedBalance() {
		return blockedBalance == null ? Optional.empty() : Optional.of(blockedBalance);
	}

	public CorporateActionBalanceDetails33 setBlockedBalance(SignedQuantityFormat9 blockedBalance) {
		this.blockedBalance = blockedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getBorrowedBalance() {
		return borrowedBalance == null ? Optional.empty() : Optional.of(borrowedBalance);
	}

	public CorporateActionBalanceDetails33 setBorrowedBalance(SignedQuantityFormat9 borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getCollateralInBalance() {
		return collateralInBalance == null ? Optional.empty() : Optional.of(collateralInBalance);
	}

	public CorporateActionBalanceDetails33 setCollateralInBalance(SignedQuantityFormat9 collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getCollateralOutBalance() {
		return collateralOutBalance == null ? Optional.empty() : Optional.of(collateralOutBalance);
	}

	public CorporateActionBalanceDetails33 setCollateralOutBalance(SignedQuantityFormat9 collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOnLoanBalance() {
		return onLoanBalance == null ? Optional.empty() : Optional.of(onLoanBalance);
	}

	public CorporateActionBalanceDetails33 setOnLoanBalance(SignedQuantityFormat9 onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOutForRegistrationBalance() {
		return outForRegistrationBalance == null ? Optional.empty() : Optional.of(outForRegistrationBalance);
	}

	public CorporateActionBalanceDetails33 setOutForRegistrationBalance(SignedQuantityFormat9 outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getSettlementPositionBalance() {
		return settlementPositionBalance == null ? Optional.empty() : Optional.of(settlementPositionBalance);
	}

	public CorporateActionBalanceDetails33 setSettlementPositionBalance(SignedQuantityFormat9 settlementPositionBalance) {
		this.settlementPositionBalance = settlementPositionBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getStreetPositionBalance() {
		return streetPositionBalance == null ? Optional.empty() : Optional.of(streetPositionBalance);
	}

	public CorporateActionBalanceDetails33 setStreetPositionBalance(SignedQuantityFormat9 streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getTradeDatePositionBalance() {
		return tradeDatePositionBalance == null ? Optional.empty() : Optional.of(tradeDatePositionBalance);
	}

	public CorporateActionBalanceDetails33 setTradeDatePositionBalance(SignedQuantityFormat9 tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInTransshipmentBalance() {
		return inTransshipmentBalance == null ? Optional.empty() : Optional.of(inTransshipmentBalance);
	}

	public CorporateActionBalanceDetails33 setInTransshipmentBalance(SignedQuantityFormat9 inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getRegisteredBalance() {
		return registeredBalance == null ? Optional.empty() : Optional.of(registeredBalance);
	}

	public CorporateActionBalanceDetails33 setRegisteredBalance(SignedQuantityFormat9 registeredBalance) {
		this.registeredBalance = registeredBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getObligatedBalance() {
		return obligatedBalance == null ? Optional.empty() : Optional.of(obligatedBalance);
	}

	public CorporateActionBalanceDetails33 setObligatedBalance(SignedQuantityFormat9 obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
		return this;
	}

	public List<PendingBalance4> getPendingDeliveryBalance() {
		return pendingDeliveryBalance == null ? pendingDeliveryBalance = new ArrayList<>() : pendingDeliveryBalance;
	}

	public CorporateActionBalanceDetails33 setPendingDeliveryBalance(List<PendingBalance4> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = Objects.requireNonNull(pendingDeliveryBalance);
		return this;
	}

	public List<PendingBalance4> getPendingReceiptBalance() {
		return pendingReceiptBalance == null ? pendingReceiptBalance = new ArrayList<>() : pendingReceiptBalance;
	}

	public CorporateActionBalanceDetails33 setPendingReceiptBalance(List<PendingBalance4> pendingReceiptBalance) {
		this.pendingReceiptBalance = Objects.requireNonNull(pendingReceiptBalance);
		return this;
	}
}