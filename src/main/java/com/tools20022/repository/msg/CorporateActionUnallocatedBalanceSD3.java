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
import com.tools20022.repository.msg.SignedQuantityFormat9;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmTotalEligibleBalance
 * CorporateActionUnallocatedBalanceSD3.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmAffectedBalance
 * CorporateActionUnallocatedBalanceSD3.mmAffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmUnaffectedBalance
 * CorporateActionUnallocatedBalanceSD3.mmUnaffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmObligatedBalance
 * CorporateActionUnallocatedBalanceSD3.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmOriginalBalance
 * CorporateActionUnallocatedBalanceSD3.mmOriginalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmPledgedBalance
 * CorporateActionUnallocatedBalanceSD3.mmPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmUnpledgedBalance
 * CorporateActionUnallocatedBalanceSD3.mmUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmInvestmentPledgedBalance
 * CorporateActionUnallocatedBalanceSD3.mmInvestmentPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3#mmInvestmentUnpledgedBalance
 * CorporateActionUnallocatedBalanceSD3.mmInvestmentUnpledgedBalance}</li>
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
 * "CorporateActionUnallocatedBalanceSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance types related to an unallocated redemption payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
 * CorporateActionUnallocatedBalanceSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedBalanceSD3", propOrder = {"totalEligibleBalance", "affectedBalance", "unaffectedBalance", "obligatedBalance", "originalBalance", "pledgedBalance", "unpledgedBalance", "investmentPledgedBalance",
		"investmentUnpledgedBalance"})
public class CorporateActionUnallocatedBalanceSD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal")
	protected SignedQuantityFormat9 totalEligibleBalance;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmTotalEligibleBalance
	 * CorporateActionUnallocatedBalanceSD1.mmTotalEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"), new DTCCSynonym(this, "Total Eligible Balance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmTotalEligibleBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setTotalEligibleBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "AfctdBal")
	protected SignedQuantityFormat9 affectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmAffectedBalance
	 * CorporateActionUnallocatedBalanceSD1.mmAffectedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmAffectedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "AfctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedBalance";
			definition = "The quantity that has been determined to be redeemed if the participant had\r\nposition in a redemption security.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmAffectedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getAffectedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setAffectedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UafctdBal")
	protected SignedQuantityFormat9 unaffectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmUnaffectedBalance
	 * CorporateActionUnallocatedBalanceSD1.mmUnaffectedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmUnaffectedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "UafctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffectedBalance";
			definition = "Positions balance remaining after lottery is run.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmUnaffectedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getUnaffectedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setUnaffectedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OblgtdBal")
	protected SignedQuantityFormat9 obligatedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmObligatedBalance
	 * CorporateActionUnallocatedBalanceSD1.mmObligatedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmObligatedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmObligatedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getObligatedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setObligatedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlBal")
	protected SignedQuantityFormat9 originalBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmOriginalBalance
	 * CorporateActionUnallocatedBalanceSD1.mmOriginalBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmOriginalBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBalance";
			definition = "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position.\r\n";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmOriginalBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getOriginalBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setOriginalBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PldgdBal")
	protected SignedQuantityFormat9 pledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * "Portion of the original balance position held in DTC general free account as of day prior to publication date. Position held in this account is subject to redemption lottery call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmPledgedBalance
	 * CorporateActionUnallocatedBalanceSD1.mmPledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmPledgedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "PldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedBalance";
			definition = "Portion of the original balance position held in DTC general free account as of day prior to publication date. Position held in this account is subject to redemption lottery call.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmPledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getPledgedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setPledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UpldgdBal")
	protected SignedQuantityFormat9 unpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * "Portion of the original balance position held in DTC general free account as of day prior to publication date. Position held in this account is subject to redemption lottery call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmUnpledgedBalance
	 * CorporateActionUnallocatedBalanceSD1.mmUnpledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmUnpledgedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "UpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnpledgedBalance";
			definition = "Portion of the original balance position held in DTC general free account as of day prior to publication date. Position held in this account is subject to redemption lottery call.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getUnpledgedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setUnpledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtPldgdBal")
	protected SignedQuantityFormat9 investmentPledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * "Portion of the original balance position held in DTC investment account as of day prior to publication date. Position held in this account is subject to redemption lottery call and must be released to allow allocation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmInvestmentPledgedBalance
	 * CorporateActionUnallocatedBalanceSD1.mmInvestmentPledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmInvestmentPledgedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Portion of the original balance position held in DTC investment account as of day prior to publication date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmInvestmentPledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getInvestmentPledgedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setInvestmentPledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtUpldgdBal")
	protected SignedQuantityFormat9 investmentUnpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3
	 * CorporateActionUnallocatedBalanceSD3}</li>
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
	 * "Portion of the original balance position held in DTC segregated account as of day prior to publication date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1#mmInvestmentUnpledgedBalance
	 * CorporateActionUnallocatedBalanceSD1.mmInvestmentUnpledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>> mmInvestmentUnpledgedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD3, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Portion of the original balance position held in DTC segregated account as of day prior to publication date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.\r\n";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmInvestmentUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD3 obj) {
			return obj.getInvestmentUnpledgedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3 obj, Optional<SignedQuantityFormat9> value) {
			obj.setInvestmentUnpledgedBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmAffectedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmUnaffectedBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmObligatedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmOriginalBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmPledgedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmUnpledgedBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmInvestmentPledgedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD3.mmInvestmentUnpledgedBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD3";
				definition = "Balance types related to an unallocated redemption payment.";
				previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SignedQuantityFormat9> getTotalEligibleBalance() {
		return totalEligibleBalance == null ? Optional.empty() : Optional.of(totalEligibleBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setTotalEligibleBalance(SignedQuantityFormat9 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getAffectedBalance() {
		return affectedBalance == null ? Optional.empty() : Optional.of(affectedBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setAffectedBalance(SignedQuantityFormat9 affectedBalance) {
		this.affectedBalance = affectedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getUnaffectedBalance() {
		return unaffectedBalance == null ? Optional.empty() : Optional.of(unaffectedBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setUnaffectedBalance(SignedQuantityFormat9 unaffectedBalance) {
		this.unaffectedBalance = unaffectedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getObligatedBalance() {
		return obligatedBalance == null ? Optional.empty() : Optional.of(obligatedBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setObligatedBalance(SignedQuantityFormat9 obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getOriginalBalance() {
		return originalBalance == null ? Optional.empty() : Optional.of(originalBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setOriginalBalance(SignedQuantityFormat9 originalBalance) {
		this.originalBalance = originalBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getPledgedBalance() {
		return pledgedBalance == null ? Optional.empty() : Optional.of(pledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setPledgedBalance(SignedQuantityFormat9 pledgedBalance) {
		this.pledgedBalance = pledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getUnpledgedBalance() {
		return unpledgedBalance == null ? Optional.empty() : Optional.of(unpledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setUnpledgedBalance(SignedQuantityFormat9 unpledgedBalance) {
		this.unpledgedBalance = unpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentPledgedBalance() {
		return investmentPledgedBalance == null ? Optional.empty() : Optional.of(investmentPledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setInvestmentPledgedBalance(SignedQuantityFormat9 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance == null ? Optional.empty() : Optional.of(investmentUnpledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD3 setInvestmentUnpledgedBalance(SignedQuantityFormat9 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
		return this;
	}
}