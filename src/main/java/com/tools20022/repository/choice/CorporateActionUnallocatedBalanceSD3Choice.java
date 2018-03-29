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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice amongst various balance types related to unallocated payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice#mmTotalEligibleBalance
 * CorporateActionUnallocatedBalanceSD3Choice.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice#mmBorrowedBalance
 * CorporateActionUnallocatedBalanceSD3Choice.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice#mmCollateralInBalance
 * CorporateActionUnallocatedBalanceSD3Choice.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice#mmCollateralOutBalance
 * CorporateActionUnallocatedBalanceSD3Choice.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice#mmOnLoanBalance
 * CorporateActionUnallocatedBalanceSD3Choice.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice#mmPendingDeliveryBalance
 * CorporateActionUnallocatedBalanceSD3Choice.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice#mmPendingReceiptBalance
 * CorporateActionUnallocatedBalanceSD3Choice.mmPendingReceiptBalance}</li>
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
 * "CorporateActionUnallocatedBalanceSD3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice amongst various balance types related to unallocated payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
 * CorporateActionUnallocatedBalanceSD2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedBalanceSD3Choice", propOrder = {"totalEligibleBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance", "pendingReceiptBalance"})
public class CorporateActionUnallocatedBalanceSD3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice
	 * CorporateActionUnallocatedBalanceSD3Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmTotalEligibleBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmTotalEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"), new DTCCSynonym(this, "Total Eligible Balance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmTotalEligibleBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public SignedQuantityFormat9 getValue(CorporateActionUnallocatedBalanceSD3Choice obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3Choice obj, SignedQuantityFormat9 value) {
			obj.setTotalEligibleBalance(value);
		}
	};
	@XmlElement(name = "BrrwdBal", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice
	 * CorporateActionUnallocatedBalanceSD3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BORR, DTCCSynonym: Stock Loan
	 * Balance (Short)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmBorrowedBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmBorrowedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9> mmBorrowedBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"), new DTCCSynonym(this, "Stock Loan Balance (Short)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmBorrowedBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public SignedQuantityFormat9 getValue(CorporateActionUnallocatedBalanceSD3Choice obj) {
			return obj.getBorrowedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3Choice obj, SignedQuantityFormat9 value) {
			obj.setBorrowedBalance(value);
		}
	};
	@XmlElement(name = "CollInBal", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice
	 * CorporateActionUnallocatedBalanceSD3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollInBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLI, DTCCSynonym: REPO (Long)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmCollateralInBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmCollateralInBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9> mmCollateralInBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"), new DTCCSynonym(this, "REPO (Long)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmCollateralInBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public SignedQuantityFormat9 getValue(CorporateActionUnallocatedBalanceSD3Choice obj) {
			return obj.getCollateralInBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3Choice obj, SignedQuantityFormat9 value) {
			obj.setCollateralInBalance(value);
		}
	};
	@XmlElement(name = "CollOutBal", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice
	 * CorporateActionUnallocatedBalanceSD3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOutBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLO, DTCCSynonym: REPO (Short)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOutBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmCollateralOutBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmCollateralOutBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9> mmCollateralOutBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"), new DTCCSynonym(this, "REPO (Short)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmCollateralOutBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public SignedQuantityFormat9 getValue(CorporateActionUnallocatedBalanceSD3Choice obj) {
			return obj.getCollateralOutBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3Choice obj, SignedQuantityFormat9 value) {
			obj.setCollateralOutBalance(value);
		}
	};
	@XmlElement(name = "OnLnBal", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice
	 * CorporateActionUnallocatedBalanceSD3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::LOAN, DTCCSynonym: Stock Loan
	 * Balance (Long)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoanBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmOnLoanBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmOnLoanBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9> mmOnLoanBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"), new DTCCSynonym(this, "Stock Loan Balance (Long)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmOnLoanBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public SignedQuantityFormat9 getValue(CorporateActionUnallocatedBalanceSD3Choice obj) {
			return obj.getOnLoanBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3Choice obj, SignedQuantityFormat9 value) {
			obj.setOnLoanBalance(value);
		}
	};
	@XmlElement(name = "PdgDlvryBal", required = true)
	protected SignedQuantityFormat9 pendingDeliveryBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice
	 * CorporateActionUnallocatedBalanceSD3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgDlvryBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PEND, DTCCSynonym: Fail (Long)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmPendingDeliveryBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmPendingDeliveryBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9> mmPendingDeliveryBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"), new DTCCSynonym(this, "Fail (Long)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmPendingDeliveryBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public SignedQuantityFormat9 getValue(CorporateActionUnallocatedBalanceSD3Choice obj) {
			return obj.getPendingDeliveryBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3Choice obj, SignedQuantityFormat9 value) {
			obj.setPendingDeliveryBalance(value);
		}
	};
	@XmlElement(name = "PdgRctBal", required = true)
	protected SignedQuantityFormat9 pendingReceiptBalance;
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
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice
	 * CorporateActionUnallocatedBalanceSD3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PENR, DTCCSynonym: Fail (Short)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice#mmPendingReceiptBalance
	 * CorporateActionUnallocatedBalanceSD2Choice.mmPendingReceiptBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9> mmPendingReceiptBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD3Choice, SignedQuantityFormat9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"), new DTCCSynonym(this, "Fail (Short)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Quantity of securities in the sub-balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmPendingReceiptBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public SignedQuantityFormat9 getValue(CorporateActionUnallocatedBalanceSD3Choice obj) {
			return obj.getPendingReceiptBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD3Choice obj, SignedQuantityFormat9 value) {
			obj.setPendingReceiptBalance(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmTotalEligibleBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmBorrowedBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmCollateralInBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmCollateralOutBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmOnLoanBalance,
						com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmPendingDeliveryBalance, com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD3Choice.mmPendingReceiptBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD3Choice";
				definition = "Choice amongst various balance types related to unallocated payment.";
				previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SignedQuantityFormat9 getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public CorporateActionUnallocatedBalanceSD3Choice setTotalEligibleBalance(SignedQuantityFormat9 totalEligibleBalance) {
		this.totalEligibleBalance = Objects.requireNonNull(totalEligibleBalance);
		return this;
	}

	public SignedQuantityFormat9 getBorrowedBalance() {
		return borrowedBalance;
	}

	public CorporateActionUnallocatedBalanceSD3Choice setBorrowedBalance(SignedQuantityFormat9 borrowedBalance) {
		this.borrowedBalance = Objects.requireNonNull(borrowedBalance);
		return this;
	}

	public SignedQuantityFormat9 getCollateralInBalance() {
		return collateralInBalance;
	}

	public CorporateActionUnallocatedBalanceSD3Choice setCollateralInBalance(SignedQuantityFormat9 collateralInBalance) {
		this.collateralInBalance = Objects.requireNonNull(collateralInBalance);
		return this;
	}

	public SignedQuantityFormat9 getCollateralOutBalance() {
		return collateralOutBalance;
	}

	public CorporateActionUnallocatedBalanceSD3Choice setCollateralOutBalance(SignedQuantityFormat9 collateralOutBalance) {
		this.collateralOutBalance = Objects.requireNonNull(collateralOutBalance);
		return this;
	}

	public SignedQuantityFormat9 getOnLoanBalance() {
		return onLoanBalance;
	}

	public CorporateActionUnallocatedBalanceSD3Choice setOnLoanBalance(SignedQuantityFormat9 onLoanBalance) {
		this.onLoanBalance = Objects.requireNonNull(onLoanBalance);
		return this;
	}

	public SignedQuantityFormat9 getPendingDeliveryBalance() {
		return pendingDeliveryBalance;
	}

	public CorporateActionUnallocatedBalanceSD3Choice setPendingDeliveryBalance(SignedQuantityFormat9 pendingDeliveryBalance) {
		this.pendingDeliveryBalance = Objects.requireNonNull(pendingDeliveryBalance);
		return this;
	}

	public SignedQuantityFormat9 getPendingReceiptBalance() {
		return pendingReceiptBalance;
	}

	public CorporateActionUnallocatedBalanceSD3Choice setPendingReceiptBalance(SignedQuantityFormat9 pendingReceiptBalance) {
		this.pendingReceiptBalance = Objects.requireNonNull(pendingReceiptBalance);
		return this;
	}
}