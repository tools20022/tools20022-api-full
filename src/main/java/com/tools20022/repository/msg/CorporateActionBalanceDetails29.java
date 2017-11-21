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
import com.tools20022.repository.choice.BalanceFormat5Choice;
import com.tools20022.repository.choice.BalanceFormat6Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTotalEligibleBalance
 * CorporateActionBalanceDetails29.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmBlockedBalance
 * CorporateActionBalanceDetails29.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmBorrowedBalance
 * CorporateActionBalanceDetails29.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmCollateralInBalance
 * CorporateActionBalanceDetails29.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmCollateralOutBalance
 * CorporateActionBalanceDetails29.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmOnLoanBalance
 * CorporateActionBalanceDetails29.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails29.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmPendingReceiptBalance
 * CorporateActionBalanceDetails29.mmPendingReceiptBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails29.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmSettlementPositionBalance
 * CorporateActionBalanceDetails29.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmStreetPositionBalance
 * CorporateActionBalanceDetails29.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails29.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInTransshipmentBalance
 * CorporateActionBalanceDetails29.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmRegisteredBalance
 * CorporateActionBalanceDetails29.mmRegisteredBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmObligatedBalance
 * CorporateActionBalanceDetails29.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUninstructedBalance
 * CorporateActionBalanceDetails29.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInstructedBalance
 * CorporateActionBalanceDetails29.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmAffectedBalance
 * CorporateActionBalanceDetails29.mmAffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUnaffectedBalance
 * CorporateActionBalanceDetails29.mmUnaffectedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
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
 * "CorporateActionBalanceDetails29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21
 * CorporateActionBalanceDetails21}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionBalanceDetails29", propOrder = {"totalEligibleBalance", "blockedBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance", "pendingReceiptBalance",
		"outForRegistrationBalance", "settlementPositionBalance", "streetPositionBalance", "tradeDatePositionBalance", "inTransshipmentBalance", "registeredBalance", "obligatedBalance", "uninstructedBalance", "instructedBalance",
		"affectedBalance", "unaffectedBalance"})
public class CorporateActionBalanceDetails29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TotalEligibleBalanceFormat8 totalEligibleBalance;
	/**
	 * Total balance of securities eligible for this corporate action event. The
	 * entitlement calculation is based on this balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat8
	 * TotalEligibleBalanceFormat8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails21.mmTotalEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalEligibleBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmTotalEligibleBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TotalEligibleBalanceFormat8.mmObject();
		}
	};
	protected BalanceFormat5Choice blockedBalance;
	/**
	 * Balance of financial instruments that are blocked.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are blocked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmBlockedBalance
	 * CorporateActionBalanceDetails21.mmBlockedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "BlckdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedBalance";
			definition = "Balance of financial instruments that are blocked.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmBlockedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice borrowedBalance;
	/**
	 * Balance of financial instruments that have been borrowed from another
	 * party.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwdBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmBorrowedBalance
	 * CorporateActionBalanceDetails21.mmBorrowedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrowedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmBorrowedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice collateralInBalance;
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollInBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmCollateralInBalance
	 * CorporateActionBalanceDetails21.mmCollateralInBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralInBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmCollateralInBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice collateralOutBalance;
	/**
	 * Balance of securities that belong to the safekeeping account indicated
	 * within this message, and are deposited with a third party for the purpose
	 * of collateralisation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOutBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmCollateralOutBalance
	 * CorporateActionBalanceDetails21.mmCollateralOutBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralOutBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmCollateralOutBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice onLoanBalance;
	/**
	 * Balance of financial instruments that have been loaned to a third party.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLnBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmOnLoanBalance
	 * CorporateActionBalanceDetails21.mmOnLoanBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLoanBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Balance of financial instruments that have been loaned to a third party.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmOnLoanBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected List<BalanceFormat6Choice> pendingDeliveryBalance;
	/**
	 * Balance of financial instruments that are pending delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgDlvryBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails21.mmPendingDeliveryBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingDeliveryBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmPendingDeliveryBalance;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat6Choice.mmObject();
		}
	};
	protected List<BalanceFormat6Choice> pendingReceiptBalance;
	/**
	 * Balance of financial instruments that are pending receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRctBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails21.mmPendingReceiptBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingReceiptBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmPendingReceiptBalance;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat6Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice outForRegistrationBalance;
	/**
	 * Balance of financial instruments currently being processed by the
	 * institution responsible for registering the new beneficial owner (or
	 * nominee).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutForRegnBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails21.mmOutForRegistrationBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutForRegistrationBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "OutForRegnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistrationBalance";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmOutForRegistrationBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected List<BalanceFormat6Choice> settlementPositionBalance;
	/**
	 * Balance of securities representing only settled transactions; pending
	 * transactions not included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPosBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails21.mmSettlementPositionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementPositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmSettlementPositionBalance;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat6Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice streetPositionBalance;
	/**
	 * Balance of financial instruments that remain registered in the name of
	 * the prior beneficial owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtPosBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmStreetPositionBalance
	 * CorporateActionBalanceDetails21.mmStreetPositionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStreetPositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "StrtPosBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPositionBalance";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmStreetPositionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice tradeDatePositionBalance;
	/**
	 * Balance of securities based on trade date, for example, includes all
	 * pending transactions in addition to the balance of settled transactions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtPosBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails21.mmTradeDatePositionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDatePositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "TradDtPosBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmTradeDatePositionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice inTransshipmentBalance;
	/**
	 * Balance of physical securities that are in the process of being
	 * transferred from one depository/agent to another.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InTrnsShipmntBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails21.mmInTransshipmentBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInTransshipmentBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "InTrnsShipmntBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipmentBalance";
			definition = "Balance of physical securities that are in the process of being transferred from one depository/agent to another.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmInTransshipmentBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice registeredBalance;
	/**
	 * Balance of financial instruments that are registered (in the name of a
	 * nominee name or of the beneficial owner).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmRegisteredBalance
	 * CorporateActionBalanceDetails21.mmRegisteredBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "RegdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredBalance";
			definition = "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner).";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmRegisteredBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice obligatedBalance;
	/**
	 * Position that account holders should return to the account servicer to
	 * participate in the event or to fulfil their obligation for the event to
	 * be complete, for example, return of securities for late announced
	 * drawing.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtdBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmObligatedBalance
	 * CorporateActionBalanceDetails21.mmObligatedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmObligatedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmObligatedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice uninstructedBalance;
	/**
	 * Balance of uninstructed position.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UinstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmUninstructedBalance
	 * CorporateActionBalanceDetails21.mmUninstructedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUninstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmUninstructedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice instructedBalance;
	/**
	 * Balance of instructed position.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmInstructedBalance
	 * CorporateActionBalanceDetails21.mmInstructedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmInstructedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice affectedBalance;
	/**
	 * Balance that has been affected by the process run through the event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AfctdBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmAffectedBalance
	 * CorporateActionBalanceDetails21.mmAffectedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAffectedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "AfctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedBalance";
			definition = "Balance that has been affected by the process run through the event.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmAffectedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected BalanceFormat5Choice unaffectedBalance;
	/**
	 * Balance that has not been affected by the process run through the event.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
	 * CorporateActionBalanceDetails29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UafctdBal"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmUnaffectedBalance
	 * CorporateActionBalanceDetails21.mmUnaffectedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnaffectedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails29.mmObject();
			isDerived = false;
			xmlTag = "UafctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffectedBalance";
			definition = "Balance that has not been affected by the process run through the event.";
			previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmUnaffectedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionBalanceDetails29.mmTotalEligibleBalance, CorporateActionBalanceDetails29.mmBlockedBalance, CorporateActionBalanceDetails29.mmBorrowedBalance,
						CorporateActionBalanceDetails29.mmCollateralInBalance, CorporateActionBalanceDetails29.mmCollateralOutBalance, CorporateActionBalanceDetails29.mmOnLoanBalance,
						CorporateActionBalanceDetails29.mmPendingDeliveryBalance, CorporateActionBalanceDetails29.mmPendingReceiptBalance, CorporateActionBalanceDetails29.mmOutForRegistrationBalance,
						CorporateActionBalanceDetails29.mmSettlementPositionBalance, CorporateActionBalanceDetails29.mmStreetPositionBalance, CorporateActionBalanceDetails29.mmTradeDatePositionBalance,
						CorporateActionBalanceDetails29.mmInTransshipmentBalance, CorporateActionBalanceDetails29.mmRegisteredBalance, CorporateActionBalanceDetails29.mmObligatedBalance,
						CorporateActionBalanceDetails29.mmUninstructedBalance, CorporateActionBalanceDetails29.mmInstructedBalance, CorporateActionBalanceDetails29.mmAffectedBalance, CorporateActionBalanceDetails29.mmUnaffectedBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails29";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
				previousVersion_lazy = () -> CorporateActionBalanceDetails21.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlElgblBal")
	public TotalEligibleBalanceFormat8 getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public void setTotalEligibleBalance(com.tools20022.repository.msg.TotalEligibleBalanceFormat8 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
	}

	@XmlElement(name = "BlckdBal")
	public BalanceFormat5Choice getBlockedBalance() {
		return blockedBalance;
	}

	public void setBlockedBalance(BalanceFormat5Choice blockedBalance) {
		this.blockedBalance = blockedBalance;
	}

	@XmlElement(name = "BrrwdBal")
	public BalanceFormat5Choice getBorrowedBalance() {
		return borrowedBalance;
	}

	public void setBorrowedBalance(BalanceFormat5Choice borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
	}

	@XmlElement(name = "CollInBal")
	public BalanceFormat5Choice getCollateralInBalance() {
		return collateralInBalance;
	}

	public void setCollateralInBalance(BalanceFormat5Choice collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
	}

	@XmlElement(name = "CollOutBal")
	public BalanceFormat5Choice getCollateralOutBalance() {
		return collateralOutBalance;
	}

	public void setCollateralOutBalance(BalanceFormat5Choice collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
	}

	@XmlElement(name = "OnLnBal")
	public BalanceFormat5Choice getOnLoanBalance() {
		return onLoanBalance;
	}

	public void setOnLoanBalance(BalanceFormat5Choice onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
	}

	@XmlElement(name = "PdgDlvryBal")
	public List<BalanceFormat6Choice> getPendingDeliveryBalance() {
		return pendingDeliveryBalance;
	}

	public void setPendingDeliveryBalance(List<BalanceFormat6Choice> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = pendingDeliveryBalance;
	}

	@XmlElement(name = "PdgRctBal")
	public List<BalanceFormat6Choice> getPendingReceiptBalance() {
		return pendingReceiptBalance;
	}

	public void setPendingReceiptBalance(List<BalanceFormat6Choice> pendingReceiptBalance) {
		this.pendingReceiptBalance = pendingReceiptBalance;
	}

	@XmlElement(name = "OutForRegnBal")
	public BalanceFormat5Choice getOutForRegistrationBalance() {
		return outForRegistrationBalance;
	}

	public void setOutForRegistrationBalance(BalanceFormat5Choice outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
	}

	@XmlElement(name = "SttlmPosBal")
	public List<BalanceFormat6Choice> getSettlementPositionBalance() {
		return settlementPositionBalance;
	}

	public void setSettlementPositionBalance(List<BalanceFormat6Choice> settlementPositionBalance) {
		this.settlementPositionBalance = settlementPositionBalance;
	}

	@XmlElement(name = "StrtPosBal")
	public BalanceFormat5Choice getStreetPositionBalance() {
		return streetPositionBalance;
	}

	public void setStreetPositionBalance(BalanceFormat5Choice streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
	}

	@XmlElement(name = "TradDtPosBal")
	public BalanceFormat5Choice getTradeDatePositionBalance() {
		return tradeDatePositionBalance;
	}

	public void setTradeDatePositionBalance(BalanceFormat5Choice tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
	}

	@XmlElement(name = "InTrnsShipmntBal")
	public BalanceFormat5Choice getInTransshipmentBalance() {
		return inTransshipmentBalance;
	}

	public void setInTransshipmentBalance(BalanceFormat5Choice inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
	}

	@XmlElement(name = "RegdBal")
	public BalanceFormat5Choice getRegisteredBalance() {
		return registeredBalance;
	}

	public void setRegisteredBalance(BalanceFormat5Choice registeredBalance) {
		this.registeredBalance = registeredBalance;
	}

	@XmlElement(name = "OblgtdBal")
	public BalanceFormat5Choice getObligatedBalance() {
		return obligatedBalance;
	}

	public void setObligatedBalance(BalanceFormat5Choice obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
	}

	@XmlElement(name = "UinstdBal")
	public BalanceFormat5Choice getUninstructedBalance() {
		return uninstructedBalance;
	}

	public void setUninstructedBalance(BalanceFormat5Choice uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
	}

	@XmlElement(name = "InstdBal")
	public BalanceFormat5Choice getInstructedBalance() {
		return instructedBalance;
	}

	public void setInstructedBalance(BalanceFormat5Choice instructedBalance) {
		this.instructedBalance = instructedBalance;
	}

	@XmlElement(name = "AfctdBal")
	public BalanceFormat5Choice getAffectedBalance() {
		return affectedBalance;
	}

	public void setAffectedBalance(BalanceFormat5Choice affectedBalance) {
		this.affectedBalance = affectedBalance;
	}

	@XmlElement(name = "UafctdBal")
	public BalanceFormat5Choice getUnaffectedBalance() {
		return unaffectedBalance;
	}

	public void setUnaffectedBalance(BalanceFormat5Choice unaffectedBalance) {
		this.unaffectedBalance = unaffectedBalance;
	}
}