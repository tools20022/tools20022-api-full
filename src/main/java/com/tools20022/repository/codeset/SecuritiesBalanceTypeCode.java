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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the securities or investment fund balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Blocked
 * SecuritiesBalanceTypeCode.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Borrowed
 * SecuritiesBalanceTypeCode.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#CollateralIn
 * SecuritiesBalanceTypeCode.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#CollateralOut
 * SecuritiesBalanceTypeCode.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#OnLoan
 * SecuritiesBalanceTypeCode.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#DerivativesMargin
 * SecuritiesBalanceTypeCode.DerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#PendingDeliveryMatchedBalance
 * SecuritiesBalanceTypeCode.PendingDeliveryMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#PendingDeliveryUnmatchedBalance
 * SecuritiesBalanceTypeCode.PendingDeliveryUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#PendingReceiptMatchedBalance
 * SecuritiesBalanceTypeCode.PendingReceiptMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#PendingReceiptUnmatchedBalance
 * SecuritiesBalanceTypeCode.PendingReceiptUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#PendingCorporateAction
 * SecuritiesBalanceTypeCode.PendingCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#PendingDelivery
 * SecuritiesBalanceTypeCode.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#PendingReceipt
 * SecuritiesBalanceTypeCode.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Pledged
 * SecuritiesBalanceTypeCode.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#OutForRegistration
 * SecuritiesBalanceTypeCode.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Restricted
 * SecuritiesBalanceTypeCode.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Unclassified
 * SecuritiesBalanceTypeCode.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#InTransshipment
 * SecuritiesBalanceTypeCode.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Drawn
 * SecuritiesBalanceTypeCode.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#TaxExempt
 * SecuritiesBalanceTypeCode.TaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#NonTaxExempt
 * SecuritiesBalanceTypeCode.NonTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Registered
 * SecuritiesBalanceTypeCode.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#StreetPosition
 * SecuritiesBalanceTypeCode.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Unregistered
 * SecuritiesBalanceTypeCode.Unregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#WaitingDocumentation
 * SecuritiesBalanceTypeCode.WaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#BeingTransferred
 * SecuritiesBalanceTypeCode.BeingTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#SidePocketComponent
 * SecuritiesBalanceTypeCode.SidePocketComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#Holdback
 * SecuritiesBalanceTypeCode.Holdback}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#TotalEligibleBalance
 * SecuritiesBalanceTypeCode.TotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#ConfirmedBalance
 * SecuritiesBalanceTypeCode.ConfirmedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#SettlementPositionBalance
 * SecuritiesBalanceTypeCode.SettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#TradeDatePositionBalance
 * SecuritiesBalanceTypeCode.TradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#ObligatedBalance
 * SecuritiesBalanceTypeCode.ObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#UninstructedBalance
 * SecuritiesBalanceTypeCode.UninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#InstructedBalance
 * SecuritiesBalanceTypeCode.InstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#TotalInstructedBalance
 * SecuritiesBalanceTypeCode.TotalInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#AffectedBalance
 * SecuritiesBalanceTypeCode.AffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#UnaffectedBalance
 * SecuritiesBalanceTypeCode.UnaffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode#ContingentRedemption
 * SecuritiesBalanceTypeCode.ContingentRedemption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
 * SecuritiesBalanceType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType2Code
 * SecuritiesBalanceType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType4Code
 * SecuritiesBalanceType4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType3Code
 * SecuritiesBalanceType3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BLOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance of securities that are blocked or frozen. A financial instrument
	 * may be unavailable due to external circumstances such as a court order,
	 * death of beneficiary or account owner, or bankruptcy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BLOK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are blocked or frozen. A financial instrument may be unavailable due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Blocked = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BLOK"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Balance of securities that are blocked or frozen. A financial instrument may be unavailable due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "BLOK";
		}
	};
	/**
	 * Balance of securities that have been borrowed from another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BORR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that have been borrowed from another party."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Borrowed = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Borrowed";
			definition = "Balance of securities that have been borrowed from another party.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode CollateralIn = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralIn";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Balance of securities that belong to the safekeeping account indicated
	 * within this message, and are deposited with a third party for the purpose
	 * of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode CollateralOut = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralOut";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Balance of securities that have been loaned to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::LOAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that have been loaned to a third party."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode OnLoan = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLoan";
			definition = "Balance of securities that have been loaned to a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Balance of securities that are used as collateral for derivatives.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::MARG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativesMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are used as collateral for derivatives."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode DerivativesMargin = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::MARG"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DerivativesMargin";
			definition = "Balance of securities that are used as collateral for derivatives.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Balance of securities pending delivery that have been matched. This is
	 * only applicable in a CSD to participant communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PDMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryMatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities pending delivery that have been matched. This is only applicable in a CSD to participant communication."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode PendingDeliveryMatchedBalance = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PDMT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingDeliveryMatchedBalance";
			definition = "Balance of securities pending delivery that have been matched. This is only applicable in a CSD to participant communication.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PDMT";
		}
	};
	/**
	 * Balance of securities pending delivery that are unmatched. This is only
	 * applicable in a CSD to participant communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PDUM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryUnmatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities pending delivery that are unmatched. This is only applicable in a CSD to participant communication."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode PendingDeliveryUnmatchedBalance = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PDUM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingDeliveryUnmatchedBalance";
			definition = "Balance of securities pending delivery that are unmatched. This is only applicable in a CSD to participant communication.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PDUM";
		}
	};
	/**
	 * Balance of securities pending receipt that have been matched. This is
	 * only applicable in a CSD to participant communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PRMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptMatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities pending receipt that have been matched. This is only applicable in a CSD to participant communication."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode PendingReceiptMatchedBalance = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PRMT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingReceiptMatchedBalance";
			definition = "Balance of securities pending receipt that have been matched. This is only applicable in a CSD to participant communication.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PRMT";
		}
	};
	/**
	 * Balance of securities pending receipt that are unmatched. This is only
	 * applicable in a CSD to participant communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PRUM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptUnmatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities pending receipt that are unmatched. This is only applicable in a CSD to participant communication."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode PendingReceiptUnmatchedBalance = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PRUM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingReceiptUnmatchedBalance";
			definition = "Balance of securities pending receipt that are unmatched. This is only applicable in a CSD to participant communication.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PRUM";
		}
	};
	/**
	 * Balance of securities, before ex-date, that are involved in a corporate
	 * action (CA). Securities blocked due to a CA, for example, proxi, in
	 * escrow, are to be identified in the BLOK sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PECA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PECA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities, before ex-date, that are involved in a corporate action (CA). Securities blocked due to a CA, for example, proxi, in escrow, are to be identified in the BLOK sub-balance."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode PendingCorporateAction = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PECA"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingCorporateAction";
			definition = "Balance of securities, before ex-date, that are involved in a corporate action (CA). Securities blocked due to a CA, for example, proxi, in escrow, are to be identified in the BLOK sub-balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PECA";
		}
	};
	/**
	 * Balance of securities that are pending delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of securities that are pending delivery."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode PendingDelivery = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingDelivery";
			definition = "Balance of securities that are pending delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Balance of securities that are pending receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PENR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of securities that are pending receipt."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode PendingReceipt = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingReceipt";
			definition = "Balance of securities that are pending receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Balance of securities that are pledged, for example, a financial
	 * instrument is unavailable because it has been used or given as a
	 * guarantee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PLED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are pledged, for example, a financial instrument is unavailable because it has been used or given as a guarantee."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Pledged = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PLED"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pledged";
			definition = "Balance of securities that are pledged, for example, a financial instrument is unavailable because it has been used or given as a guarantee.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "PLED";
		}
	};
	/**
	 * Balance of securities currently being processed by the institution
	 * responsible for registering the new beneficial owner (or nominee) of
	 * securities after a transaction has settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::REGO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities currently being processed by the institution responsible for registering the new beneficial owner (or nominee) of securities after a transaction has settled."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode OutForRegistration = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::REGO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OutForRegistration";
			definition = "Balance of securities currently being processed by the institution responsible for registering the new beneficial owner (or nominee) of securities after a transaction has settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "REGO";
		}
	};
	/**
	 * Balance of securities that may only be sold under certain conditions or
	 * require legal documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::RSTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that may only be sold under certain conditions or require legal documents."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Restricted = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::RSTR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Balance of securities that may only be sold under certain conditions or require legal documents.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "RSTR";
		}
	};
	/**
	 * Balance of securities that is unclassified, ie, is not identified with
	 * one of the existing sub-balance types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::OTHR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that is unclassified, ie, is  not identified with one of the existing sub-balance types."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Unclassified = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::OTHR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unclassified";
			definition = "Balance of securities that is unclassified, ie, is  not identified with one of the existing sub-balance types.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Balance of physical securities that are in transshipment, eg, in the
	 * process of being transferred from one depository or agent to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of physical securities that are in transshipment, eg, in the process of being transferred from one depository or agent to another."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode InTransshipment = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InTransshipment";
			definition = "Balance of physical securities that are in transshipment, eg, in the process of being transferred from one depository or agent to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Balance of securities that are drawn for redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::DRAW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of securities that are drawn for redemption."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Drawn = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::DRAW"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Drawn";
			definition = "Balance of securities that are drawn for redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Balance of tax-exempt securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::CLEN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of tax-exempt securities."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode TaxExempt = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::CLEN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxExempt";
			definition = "Balance of tax-exempt securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Balance of taxable securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::DIRT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of taxable securities."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode NonTaxExempt = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::DIRT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonTaxExempt";
			definition = "Balance of taxable securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Balance of securities that are registered (in the name of a nominee or of
	 * the beneficial owner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::NOMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are registered (in the name of a nominee or of the beneficial owner)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Registered = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::NOMI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registered";
			definition = "Balance of securities that are registered (in the name of a nominee or of the beneficial owner).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Balance of securities that remain registered in the name of the prior
	 * beneficial owner of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SPOS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that remain registered in the name of the prior beneficial owner of securities."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode StreetPosition = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SPOS"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StreetPosition";
			definition = "Balance of securities that remain registered in the name of the prior beneficial owner of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "SPOS";
		}
	};
	/**
	 * Balance of securities that could not be registered due to foreign
	 * ownership limitation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNRG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unregistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that could not be registered due to foreign ownership limitation."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Unregistered = new SecuritiesBalanceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNRG"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unregistered";
			definition = "Balance of securities that could not be registered due to foreign ownership limitation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "UNRG";
		}
	};
	/**
	 * Financial instrument is unavailable due to missing or incomplete
	 * documentation pertaining to the account, or due to a missing or
	 * incomplete order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode WaitingDocumentation = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaitingDocumentation";
			definition = "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "WDOC";
		}
	};
	/**
	 * Financial instrument is unavailable as a result of a transfer order,
	 * pending movement in the shareholders' register.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode BeingTransferred = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeingTransferred";
			definition = "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "BTRA";
		}
	};
	/**
	 * Investment fund order contains a side pocket component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund order contains a side pocket component."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode SidePocketComponent = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SidePocketComponent";
			definition = "Investment fund order contains a side pocket component.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "SPCM";
		}
	};
	/**
	 * Investment fund order execution subject to redemption proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Holdback"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund order execution subject to redemption proceeds."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode Holdback = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Holdback";
			definition = "Investment fund order execution subject to redemption proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Total balance of securities eligible for this corporate action event. The
	 * entitlement calculation is based on this balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode TotalEligibleBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Balance to which the payment applies (less or equal to the total eligible
	 * balance).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance to which the payment applies (less or equal to the total eligible balance)."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode ConfirmedBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConfirmedBalance";
			definition = "Balance to which the payment applies (less or equal to the total eligible balance).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "CONB";
		}
	};
	/**
	 * Balance of securities representing only settled transactions; pending
	 * transactions not included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities representing only settled transactions; pending transactions not included."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode SettlementPositionBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Balance of securities based on trade date, eg, includes all pending
	 * transactions in addition to the balance of settled transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDatePositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities based on trade date, eg, includes all pending transactions in addition to the balance of settled transactions."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode TradeDatePositionBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, eg, includes all pending transactions in addition to the balance of settled transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Position that account holders should return to the account servicer to
	 * participate in the event or to fulfil their obligation for the event to
	 * be complete, eg, return of securities for late announced drawing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OBAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligatedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, eg, return of securities for late announced drawing."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode ObligatedBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, eg, return of securities for late announced drawing.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "OBAL";
		}
	};
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode UninstructedBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "UNBA";
		}
	};
	/**
	 * Balance of instructed position per option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position per option."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode InstructedBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position per option.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "INBA";
		}
	};
	/**
	 * Balance of total instructed position (for all options).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of total instructed position (for all options)."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode TotalInstructedBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalInstructedBalance";
			definition = "Balance of total instructed position (for all options).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "TIBA";
		}
	};
	/**
	 * Balance that has been affected by the process run through the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFFB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has been affected by the process run through the event."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode AffectedBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AffectedBalance";
			definition = "Balance that has been affected by the process run through the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "AFFB";
		}
	};
	/**
	 * Balance that has not been affected by the process run through the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnaffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has not been affected by the process run through the event."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode UnaffectedBalance = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnaffectedBalance";
			definition = "Balance that has not been affected by the process run through the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "UNAF";
		}
	};
	/**
	 * Balance not available for general redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
	 * SecuritiesBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContingentRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance not available for general redemption."</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceTypeCode ContingentRedemption = new SecuritiesBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContingentRedemption";
			definition = "Balance not available for general redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.mmObject();
			codeName = "CTRD";
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceTypeCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTypeCode";
				definition = "Specifies the nature of the securities or investment fund balance.";
				derivation_lazy = () -> Arrays.asList(SecuritiesBalanceType1Code.mmObject(), SecuritiesBalanceType2Code.mmObject(), SecuritiesBalanceType4Code.mmObject(), SecuritiesBalanceType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Blocked, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Borrowed,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.CollateralIn, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.PendingDeliveryMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.PendingDeliveryUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.PendingReceiptMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.PendingReceiptUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.PendingCorporateAction, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.PendingDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.PendingReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Pledged,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.OutForRegistration, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Restricted,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Unclassified, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.InTransshipment,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Drawn, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.TaxExempt, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.NonTaxExempt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Registered, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.StreetPosition,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Unregistered, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.WaitingDocumentation,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.BeingTransferred, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.SidePocketComponent,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.Holdback, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.TotalEligibleBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.ConfirmedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.SettlementPositionBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.TradeDatePositionBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.ObligatedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.UninstructedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.InstructedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.TotalInstructedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.AffectedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.UnaffectedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeCode.ContingentRedemption);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(DerivativesMargin.getCodeName().get(), DerivativesMargin);
		codesByName.put(PendingDeliveryMatchedBalance.getCodeName().get(), PendingDeliveryMatchedBalance);
		codesByName.put(PendingDeliveryUnmatchedBalance.getCodeName().get(), PendingDeliveryUnmatchedBalance);
		codesByName.put(PendingReceiptMatchedBalance.getCodeName().get(), PendingReceiptMatchedBalance);
		codesByName.put(PendingReceiptUnmatchedBalance.getCodeName().get(), PendingReceiptUnmatchedBalance);
		codesByName.put(PendingCorporateAction.getCodeName().get(), PendingCorporateAction);
		codesByName.put(PendingDelivery.getCodeName().get(), PendingDelivery);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(InTransshipment.getCodeName().get(), InTransshipment);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(TaxExempt.getCodeName().get(), TaxExempt);
		codesByName.put(NonTaxExempt.getCodeName().get(), NonTaxExempt);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(StreetPosition.getCodeName().get(), StreetPosition);
		codesByName.put(Unregistered.getCodeName().get(), Unregistered);
		codesByName.put(WaitingDocumentation.getCodeName().get(), WaitingDocumentation);
		codesByName.put(BeingTransferred.getCodeName().get(), BeingTransferred);
		codesByName.put(SidePocketComponent.getCodeName().get(), SidePocketComponent);
		codesByName.put(Holdback.getCodeName().get(), Holdback);
		codesByName.put(TotalEligibleBalance.getCodeName().get(), TotalEligibleBalance);
		codesByName.put(ConfirmedBalance.getCodeName().get(), ConfirmedBalance);
		codesByName.put(SettlementPositionBalance.getCodeName().get(), SettlementPositionBalance);
		codesByName.put(TradeDatePositionBalance.getCodeName().get(), TradeDatePositionBalance);
		codesByName.put(ObligatedBalance.getCodeName().get(), ObligatedBalance);
		codesByName.put(UninstructedBalance.getCodeName().get(), UninstructedBalance);
		codesByName.put(InstructedBalance.getCodeName().get(), InstructedBalance);
		codesByName.put(TotalInstructedBalance.getCodeName().get(), TotalInstructedBalance);
		codesByName.put(AffectedBalance.getCodeName().get(), AffectedBalance);
		codesByName.put(UnaffectedBalance.getCodeName().get(), UnaffectedBalance);
		codesByName.put(ContingentRedemption.getCodeName().get(), ContingentRedemption);
	}

	public static SecuritiesBalanceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceTypeCode[] values() {
		SecuritiesBalanceTypeCode[] values = new SecuritiesBalanceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceTypeCode> {
		@Override
		public SecuritiesBalanceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}