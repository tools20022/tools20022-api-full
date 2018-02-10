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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balance types related to an unallocated redemption payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmTotalEligibleBalance
 * CorporateActionUnallocatedBalanceSD1.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmAffectedBalance
 * CorporateActionUnallocatedBalanceSD1.mmAffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmUnaffectedBalance
 * CorporateActionUnallocatedBalanceSD1.mmUnaffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmObligatedBalance
 * CorporateActionUnallocatedBalanceSD1.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmOriginalBalance
 * CorporateActionUnallocatedBalanceSD1.mmOriginalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmPledgedBalance
 * CorporateActionUnallocatedBalanceSD1.mmPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmUnpledgedBalance
 * CorporateActionUnallocatedBalanceSD1.mmUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmInvestmentPledgedBalance
 * CorporateActionUnallocatedBalanceSD1.mmInvestmentPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmInvestmentUnpledgedBalance
 * CorporateActionUnallocatedBalanceSD1.mmInvestmentUnpledgedBalance}</li>
 * </ul>
 * </li>
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
 * "CorporateActionUnallocatedBalanceSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance types related to an unallocated redemption payment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedBalanceSD1", propOrder = {"totalEligibleBalance", "affectedBalance", "unaffectedBalance", "obligatedBalance", "originalBalance", "pledgedBalance", "unpledgedBalance", "investmentPledgedBalance",
		"investmentUnpledgedBalance"})
public class CorporateActionUnallocatedBalanceSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal")
	protected SignedQuantityFormat4 totalEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::ELIG, DTCCSynonym: Total
	 * Eligible Balance</li>
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
	public static final MMMessageAttribute mmTotalEligibleBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"), new DTCCSynonym(this, "Total Eligible Balance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "AfctdBal")
	protected SignedQuantityFormat4 affectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
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
	 * "The quantity that has been determined to be redeemed if the participant had\r\nposition in a redemption security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAffectedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "AfctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedBalance";
			definition = "The quantity that has been determined to be redeemed if the participant had\r\nposition in a redemption security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "UafctdBal")
	protected SignedQuantityFormat4 unaffectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
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
	 * definition} = "Positions balance remaining after lottery is run."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnaffectedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "UafctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffectedBalance";
			definition = "Positions balance remaining after lottery is run.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "OblgtdBal")
	protected SignedQuantityFormat4 obligatedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
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
	 * "Position that account holders should return to the account servicer to participate in the event or to fulfill their obligation for the event to be complete, for example, return of securities for late announced drawing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmObligatedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfill their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "OrgnlBal")
	protected SignedQuantityFormat4 originalBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBalance";
			definition = "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "PldgdBal")
	protected SignedQuantityFormat4 pledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "PldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedBalance";
			definition = "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "UpldgdBal")
	protected SignedQuantityFormat4 unpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnpledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "UpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "InvstmtPldgdBal")
	protected SignedQuantityFormat4 investmentPledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC Investment account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentPledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Investment account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};
	@XmlElement(name = "InvstmtUpldgdBal")
	protected SignedQuantityFormat4 investmentUnpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtUpldgdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentUnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC Segregated account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentUnpledgedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Segregated account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmAffectedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmUnaffectedBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmObligatedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmOriginalBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmPledgedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmUnpledgedBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmInvestmentPledgedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1.mmInvestmentUnpledgedBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD1";
				definition = "Balance types related to an unallocated redemption payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SignedQuantityFormat4> getTotalEligibleBalance() {
		return totalEligibleBalance == null ? Optional.empty() : Optional.of(totalEligibleBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setTotalEligibleBalance(com.tools20022.repository.msg.SignedQuantityFormat4 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getAffectedBalance() {
		return affectedBalance == null ? Optional.empty() : Optional.of(affectedBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setAffectedBalance(com.tools20022.repository.msg.SignedQuantityFormat4 affectedBalance) {
		this.affectedBalance = affectedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getUnaffectedBalance() {
		return unaffectedBalance == null ? Optional.empty() : Optional.of(unaffectedBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setUnaffectedBalance(com.tools20022.repository.msg.SignedQuantityFormat4 unaffectedBalance) {
		this.unaffectedBalance = unaffectedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getObligatedBalance() {
		return obligatedBalance == null ? Optional.empty() : Optional.of(obligatedBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setObligatedBalance(com.tools20022.repository.msg.SignedQuantityFormat4 obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getOriginalBalance() {
		return originalBalance == null ? Optional.empty() : Optional.of(originalBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setOriginalBalance(com.tools20022.repository.msg.SignedQuantityFormat4 originalBalance) {
		this.originalBalance = originalBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getPledgedBalance() {
		return pledgedBalance == null ? Optional.empty() : Optional.of(pledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setPledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat4 pledgedBalance) {
		this.pledgedBalance = pledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getUnpledgedBalance() {
		return unpledgedBalance == null ? Optional.empty() : Optional.of(unpledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setUnpledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat4 unpledgedBalance) {
		this.unpledgedBalance = unpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getInvestmentPledgedBalance() {
		return investmentPledgedBalance == null ? Optional.empty() : Optional.of(investmentPledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setInvestmentPledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat4 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance == null ? Optional.empty() : Optional.of(investmentUnpledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD1 setInvestmentUnpledgedBalance(com.tools20022.repository.msg.SignedQuantityFormat4 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
		return this;
	}
}