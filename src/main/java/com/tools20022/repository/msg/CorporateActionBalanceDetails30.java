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
import com.tools20022.repository.choice.BalanceFormat5Choice;
import com.tools20022.repository.choice.Quantity17Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstructedBalanceDetails5;
import com.tools20022.repository.msg.PendingBalance3;
import com.tools20022.repository.msg.SignedQuantityFormat6;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalEligibleBalance
 * CorporateActionBalanceDetails30.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmUninstructedBalance
 * CorporateActionBalanceDetails30.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalInstructedBalanceDetails
 * CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmBlockedBalance
 * CorporateActionBalanceDetails30.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmBorrowedBalance
 * CorporateActionBalanceDetails30.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmCollateralInBalance
 * CorporateActionBalanceDetails30.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmCollateralOutBalance
 * CorporateActionBalanceDetails30.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmOnLoanBalance
 * CorporateActionBalanceDetails30.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails30.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmSettlementPositionBalance
 * CorporateActionBalanceDetails30.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmStreetPositionBalance
 * CorporateActionBalanceDetails30.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails30.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmInTransshipmentBalance
 * CorporateActionBalanceDetails30.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmRegisteredBalance
 * CorporateActionBalanceDetails30.mmRegisteredBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmObligatedBalance
 * CorporateActionBalanceDetails30.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails30.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmPendingReceiptBalance
 * CorporateActionBalanceDetails30.mmPendingReceiptBalance}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionBalanceDetails30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37
 * CorporateActionBalanceDetails37}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9
 * CorporateActionBalanceDetails9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionBalanceDetails30", propOrder = {"totalEligibleBalance", "uninstructedBalance", "totalInstructedBalanceDetails", "blockedBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance",
		"onLoanBalance", "outForRegistrationBalance", "settlementPositionBalance", "streetPositionBalance", "tradeDatePositionBalance", "inTransshipmentBalance", "registeredBalance", "obligatedBalance", "pendingDeliveryBalance",
		"pendingReceiptBalance"})
public class CorporateActionBalanceDetails30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal", required = true)
	protected Quantity17Choice totalEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity17Choice
	 * Quantity17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::ELIG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails37.mmTotalEligibleBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails9.mmTotalEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Quantity17Choice> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Quantity17Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmTotalEligibleBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmTotalEligibleBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity17Choice.mmObject();
		}

		@Override
		public Quantity17Choice getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Quantity17Choice value) {
			obj.setTotalEligibleBalance(value);
		}
	};
	@XmlElement(name = "UinstdBal", required = true)
	protected BalanceFormat5Choice uninstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice
	 * BalanceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UinstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmUninstructedBalance
	 * CorporateActionBalanceDetails37.mmUninstructedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmUninstructedBalance
	 * CorporateActionBalanceDetails9.mmUninstructedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, BalanceFormat5Choice> mmUninstructedBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, BalanceFormat5Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmUninstructedBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmUninstructedBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}

		@Override
		public BalanceFormat5Choice getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getUninstructedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, BalanceFormat5Choice value) {
			obj.setUninstructedBalance(value);
		}
	};
	@XmlElement(name = "TtlInstdBalDtls", required = true)
	protected InstructedBalanceDetails5 totalInstructedBalanceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5
	 * InstructedBalanceDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlInstdBalDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInstructedBalanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the total instructed balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails37.mmTotalInstructedBalanceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails9.mmTotalInstructedBalanceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceDetails30, InstructedBalanceDetails5> mmTotalInstructedBalanceDetails = new MMMessageAssociationEnd<CorporateActionBalanceDetails30, InstructedBalanceDetails5>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "TtlInstdBalDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInstructedBalanceDetails";
			definition = "Provides information about the total instructed balance.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmTotalInstructedBalanceDetails);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmTotalInstructedBalanceDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructedBalanceDetails5.mmObject();
		}

		@Override
		public InstructedBalanceDetails5 getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getTotalInstructedBalanceDetails();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, InstructedBalanceDetails5 value) {
			obj.setTotalInstructedBalanceDetails(value);
		}
	};
	@XmlElement(name = "BlckdBal")
	protected SignedQuantityFormat6 blockedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are blocked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BLOK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmBlockedBalance
	 * CorporateActionBalanceDetails37.mmBlockedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmBlockedBalance
	 * CorporateActionBalanceDetails9.mmBlockedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmBlockedBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "BlckdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedBalance";
			definition = "Balance of financial instruments that are blocked.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmBlockedBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmBlockedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getBlockedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setBlockedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwdBal")
	protected SignedQuantityFormat6 borrowedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been borrowed from another party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BORR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmBorrowedBalance
	 * CorporateActionBalanceDetails37.mmBorrowedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmBorrowedBalance
	 * CorporateActionBalanceDetails9.mmBorrowedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmBorrowedBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmBorrowedBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmBorrowedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getBorrowedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setBorrowedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollInBal")
	protected SignedQuantityFormat6 collateralInBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollInBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmCollateralInBalance
	 * CorporateActionBalanceDetails37.mmCollateralInBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmCollateralInBalance
	 * CorporateActionBalanceDetails9.mmCollateralInBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmCollateralInBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmCollateralInBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmCollateralInBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getCollateralInBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setCollateralInBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollOutBal")
	protected SignedQuantityFormat6 collateralOutBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOutBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOutBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmCollateralOutBalance
	 * CorporateActionBalanceDetails37.mmCollateralOutBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmCollateralOutBalance
	 * CorporateActionBalanceDetails9.mmCollateralOutBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmCollateralOutBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmCollateralOutBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmCollateralOutBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getCollateralOutBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setCollateralOutBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OnLnBal")
	protected SignedQuantityFormat6 onLoanBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLnBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoanBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been loaned to a third party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::LOAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmOnLoanBalance
	 * CorporateActionBalanceDetails37.mmOnLoanBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmOnLoanBalance
	 * CorporateActionBalanceDetails9.mmOnLoanBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmOnLoanBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Balance of financial instruments that have been loaned to a third party.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmOnLoanBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmOnLoanBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getOnLoanBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setOnLoanBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OutForRegnBal")
	protected SignedQuantityFormat6 outForRegistrationBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutForRegnBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistrationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::REGO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails37.mmOutForRegistrationBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails9.mmOutForRegistrationBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmOutForRegistrationBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "OutForRegnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::REGO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistrationBalance";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmOutForRegistrationBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmOutForRegistrationBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getOutForRegistrationBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setOutForRegistrationBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPosBal")
	protected SignedQuantityFormat6 settlementPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPosBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities representing only settled transactions; pending transactions not included."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails37.mmSettlementPositionBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails9.mmSettlementPositionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmSettlementPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmSettlementPositionBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmSettlementPositionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getSettlementPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setSettlementPositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "StrtPosBal")
	protected SignedQuantityFormat6 streetPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtPosBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that remain registered in the name of the prior beneficial owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SPOS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmStreetPositionBalance
	 * CorporateActionBalanceDetails37.mmStreetPositionBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmStreetPositionBalance
	 * CorporateActionBalanceDetails9.mmStreetPositionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmStreetPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "StrtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SPOS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPositionBalance";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmStreetPositionBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmStreetPositionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getStreetPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setStreetPositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtPosBal")
	protected SignedQuantityFormat6 tradeDatePositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtPosBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDatePositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails37.mmTradeDatePositionBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails9.mmTradeDatePositionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmTradeDatePositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "TradDtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmTradeDatePositionBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmTradeDatePositionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getTradeDatePositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setTradeDatePositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InTrnsShipmntBal")
	protected SignedQuantityFormat6 inTransshipmentBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InTrnsShipmntBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipmentBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of physical securities that are in the process of being transferred from one depository/agent to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails37.mmInTransshipmentBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails9.mmInTransshipmentBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmInTransshipmentBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "InTrnsShipmntBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipmentBalance";
			definition = "Balance of physical securities that are in the process of being transferred from one depository/agent to another.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmInTransshipmentBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmInTransshipmentBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getInTransshipmentBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setInTransshipmentBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "RegdBal")
	protected SignedQuantityFormat6 registeredBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::NOMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmRegisteredBalance
	 * CorporateActionBalanceDetails37.mmRegisteredBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmRegisteredBalance
	 * CorporateActionBalanceDetails9.mmRegisteredBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmRegisteredBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "RegdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::NOMI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredBalance";
			definition = "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmRegisteredBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmRegisteredBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getRegisteredBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setRegisteredBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OblgtdBal")
	protected SignedQuantityFormat6 obligatedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligatedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:OBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmObligatedBalance
	 * CorporateActionBalanceDetails37.mmObligatedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmObligatedBalance
	 * CorporateActionBalanceDetails9.mmObligatedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>> mmObligatedBalance = new MMMessageAttribute<CorporateActionBalanceDetails30, Optional<SignedQuantityFormat6>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:OBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmObligatedBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmObligatedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat6> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getObligatedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, Optional<SignedQuantityFormat6> value) {
			obj.setObligatedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgDlvryBal")
	protected List<PendingBalance3> pendingDeliveryBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingBalance3
	 * PendingBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgDlvryBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails37.mmPendingDeliveryBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails9.mmPendingDeliveryBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceDetails30, List<PendingBalance3>> mmPendingDeliveryBalance = new MMMessageAssociationEnd<CorporateActionBalanceDetails30, List<PendingBalance3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmPendingDeliveryBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmPendingDeliveryBalance;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingBalance3.mmObject();
		}

		@Override
		public List<PendingBalance3> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getPendingDeliveryBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, List<PendingBalance3> value) {
			obj.setPendingDeliveryBalance(value);
		}
	};
	@XmlElement(name = "PdgRctBal")
	protected List<PendingBalance3> pendingReceiptBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PendingBalance3
	 * PendingBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
	 * CorporateActionBalanceDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRctBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PENR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails37.mmPendingReceiptBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails9.mmPendingReceiptBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceDetails30, List<PendingBalance3>> mmPendingReceiptBalance = new MMMessageAssociationEnd<CorporateActionBalanceDetails30, List<PendingBalance3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmPendingReceiptBalance);
			previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmPendingReceiptBalance;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingBalance3.mmObject();
		}

		@Override
		public List<PendingBalance3> getValue(CorporateActionBalanceDetails30 obj) {
			return obj.getPendingReceiptBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails30 obj, List<PendingBalance3> value) {
			obj.setPendingReceiptBalance(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmUninstructedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmBlockedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmCollateralInBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmOnLoanBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmSettlementPositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmTradeDatePositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmRegisteredBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmPendingDeliveryBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails30.mmPendingReceiptBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails30";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails37.mmObject());
				previousVersion_lazy = () -> CorporateActionBalanceDetails9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Quantity17Choice getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public CorporateActionBalanceDetails30 setTotalEligibleBalance(Quantity17Choice totalEligibleBalance) {
		this.totalEligibleBalance = Objects.requireNonNull(totalEligibleBalance);
		return this;
	}

	public BalanceFormat5Choice getUninstructedBalance() {
		return uninstructedBalance;
	}

	public CorporateActionBalanceDetails30 setUninstructedBalance(BalanceFormat5Choice uninstructedBalance) {
		this.uninstructedBalance = Objects.requireNonNull(uninstructedBalance);
		return this;
	}

	public InstructedBalanceDetails5 getTotalInstructedBalanceDetails() {
		return totalInstructedBalanceDetails;
	}

	public CorporateActionBalanceDetails30 setTotalInstructedBalanceDetails(InstructedBalanceDetails5 totalInstructedBalanceDetails) {
		this.totalInstructedBalanceDetails = Objects.requireNonNull(totalInstructedBalanceDetails);
		return this;
	}

	public Optional<SignedQuantityFormat6> getBlockedBalance() {
		return blockedBalance == null ? Optional.empty() : Optional.of(blockedBalance);
	}

	public CorporateActionBalanceDetails30 setBlockedBalance(SignedQuantityFormat6 blockedBalance) {
		this.blockedBalance = blockedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getBorrowedBalance() {
		return borrowedBalance == null ? Optional.empty() : Optional.of(borrowedBalance);
	}

	public CorporateActionBalanceDetails30 setBorrowedBalance(SignedQuantityFormat6 borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getCollateralInBalance() {
		return collateralInBalance == null ? Optional.empty() : Optional.of(collateralInBalance);
	}

	public CorporateActionBalanceDetails30 setCollateralInBalance(SignedQuantityFormat6 collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getCollateralOutBalance() {
		return collateralOutBalance == null ? Optional.empty() : Optional.of(collateralOutBalance);
	}

	public CorporateActionBalanceDetails30 setCollateralOutBalance(SignedQuantityFormat6 collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getOnLoanBalance() {
		return onLoanBalance == null ? Optional.empty() : Optional.of(onLoanBalance);
	}

	public CorporateActionBalanceDetails30 setOnLoanBalance(SignedQuantityFormat6 onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getOutForRegistrationBalance() {
		return outForRegistrationBalance == null ? Optional.empty() : Optional.of(outForRegistrationBalance);
	}

	public CorporateActionBalanceDetails30 setOutForRegistrationBalance(SignedQuantityFormat6 outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getSettlementPositionBalance() {
		return settlementPositionBalance == null ? Optional.empty() : Optional.of(settlementPositionBalance);
	}

	public CorporateActionBalanceDetails30 setSettlementPositionBalance(SignedQuantityFormat6 settlementPositionBalance) {
		this.settlementPositionBalance = settlementPositionBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getStreetPositionBalance() {
		return streetPositionBalance == null ? Optional.empty() : Optional.of(streetPositionBalance);
	}

	public CorporateActionBalanceDetails30 setStreetPositionBalance(SignedQuantityFormat6 streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getTradeDatePositionBalance() {
		return tradeDatePositionBalance == null ? Optional.empty() : Optional.of(tradeDatePositionBalance);
	}

	public CorporateActionBalanceDetails30 setTradeDatePositionBalance(SignedQuantityFormat6 tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getInTransshipmentBalance() {
		return inTransshipmentBalance == null ? Optional.empty() : Optional.of(inTransshipmentBalance);
	}

	public CorporateActionBalanceDetails30 setInTransshipmentBalance(SignedQuantityFormat6 inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getRegisteredBalance() {
		return registeredBalance == null ? Optional.empty() : Optional.of(registeredBalance);
	}

	public CorporateActionBalanceDetails30 setRegisteredBalance(SignedQuantityFormat6 registeredBalance) {
		this.registeredBalance = registeredBalance;
		return this;
	}

	public Optional<SignedQuantityFormat6> getObligatedBalance() {
		return obligatedBalance == null ? Optional.empty() : Optional.of(obligatedBalance);
	}

	public CorporateActionBalanceDetails30 setObligatedBalance(SignedQuantityFormat6 obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
		return this;
	}

	public List<PendingBalance3> getPendingDeliveryBalance() {
		return pendingDeliveryBalance == null ? pendingDeliveryBalance = new ArrayList<>() : pendingDeliveryBalance;
	}

	public CorporateActionBalanceDetails30 setPendingDeliveryBalance(List<PendingBalance3> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = Objects.requireNonNull(pendingDeliveryBalance);
		return this;
	}

	public List<PendingBalance3> getPendingReceiptBalance() {
		return pendingReceiptBalance == null ? pendingReceiptBalance = new ArrayList<>() : pendingReceiptBalance;
	}

	public CorporateActionBalanceDetails30 setPendingReceiptBalance(List<PendingBalance3> pendingReceiptBalance) {
		this.pendingReceiptBalance = Objects.requireNonNull(pendingReceiptBalance);
		return this;
	}
}