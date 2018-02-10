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
import com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#All
 * InvestmentFundTransactionType1Code.All}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#SecuritiesSale
 * InvestmentFundTransactionType1Code.SecuritiesSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#SecuritiesPurchase
 * InvestmentFundTransactionType1Code.SecuritiesPurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#SwitchOut
 * InvestmentFundTransactionType1Code.SwitchOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#TransferIn
 * InvestmentFundTransactionType1Code.TransferIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#TransferOut
 * InvestmentFundTransactionType1Code.TransferOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#Subscription
 * InvestmentFundTransactionType1Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#Redemption
 * InvestmentFundTransactionType1Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#CashDeposit
 * InvestmentFundTransactionType1Code.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#CashWithdrawal
 * InvestmentFundTransactionType1Code.CashWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#DividendPayment
 * InvestmentFundTransactionType1Code.DividendPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#CorporationActionEvent
 * InvestmentFundTransactionType1Code.CorporationActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#CrossIn
 * InvestmentFundTransactionType1Code.CrossIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#CrossOut
 * InvestmentFundTransactionType1Code.CrossOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#Dividend
 * InvestmentFundTransactionType1Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#InSpecie
 * InvestmentFundTransactionType1Code.InSpecie}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#Other
 * InvestmentFundTransactionType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#RedemptionAssetAllocation
 * InvestmentFundTransactionType1Code.RedemptionAssetAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#RedemptionWithdrawingPlan
 * InvestmentFundTransactionType1Code.RedemptionWithdrawingPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#ReinvestmentOfDividend
 * InvestmentFundTransactionType1Code.ReinvestmentOfDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#SubscriptionSavingsPlan
 * InvestmentFundTransactionType1Code.SubscriptionSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code#SubscriptionAssetAllocation
 * InvestmentFundTransactionType1Code.SubscriptionAssetAllocation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
 * InvestmentFundTransactionTypeCode}</li>
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
 * "InvestmentFundTransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundTransactionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code All = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.All.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSale"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code SecuritiesSale = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SecuritiesSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPurchase"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code SecuritiesPurchase = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SecuritiesPurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOut"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code SwitchOut = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOut";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SwitchOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIn"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code TransferIn = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIn";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.TransferIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOut"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code TransferOut = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOut";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.TransferOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BUSE//SUBS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code Subscription = new InvestmentFundTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BUSE//SUBS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BUSE//REDM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code Redemption = new InvestmentFundTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BUSE//REDM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code CashDeposit = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CashDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashWithdrawal"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code CashWithdrawal = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CashWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPayment"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code DividendPayment = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.DividendPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporationActionEvent"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code CorporationActionEvent = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporationActionEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CorporationActionEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossIn"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code CrossIn = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossIn";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CrossIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossOut"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code CrossOut = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossOut";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CrossOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code Dividend = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSpecie"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code InSpecie = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSpecie";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.InSpecie.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code Other = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAssetAllocation"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code RedemptionAssetAllocation = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAssetAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.RedemptionAssetAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionWithdrawingPlan"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code RedemptionWithdrawingPlan = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionWithdrawingPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.RedemptionWithdrawingPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentOfDividend"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code ReinvestmentOfDividend = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentOfDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.ReinvestmentOfDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionSavingsPlan"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code SubscriptionSavingsPlan = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SubscriptionSavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionType1Code
	 * InvestmentFundTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionAssetAllocation"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionType1Code SubscriptionAssetAllocation = new InvestmentFundTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionAssetAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SubscriptionAssetAllocation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundTransactionType1Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundTransactionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransactionType1Code";
				definition = "Specifies the type of transaction.";
				trace_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.All, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.SecuritiesSale,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.SecuritiesPurchase, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.SwitchOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.TransferIn, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.TransferOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.Subscription, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.Redemption,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.CashDeposit, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.CashWithdrawal,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.DividendPayment, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.CorporationActionEvent,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.CrossIn, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.CrossOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.Dividend, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.InSpecie,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.Other, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.RedemptionAssetAllocation,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.RedemptionWithdrawingPlan, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.ReinvestmentOfDividend,
						com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.SubscriptionSavingsPlan, com.tools20022.repository.codeset.InvestmentFundTransactionType1Code.SubscriptionAssetAllocation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(SecuritiesSale.getCodeName().get(), SecuritiesSale);
		codesByName.put(SecuritiesPurchase.getCodeName().get(), SecuritiesPurchase);
		codesByName.put(SwitchOut.getCodeName().get(), SwitchOut);
		codesByName.put(TransferIn.getCodeName().get(), TransferIn);
		codesByName.put(TransferOut.getCodeName().get(), TransferOut);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(CashDeposit.getCodeName().get(), CashDeposit);
		codesByName.put(CashWithdrawal.getCodeName().get(), CashWithdrawal);
		codesByName.put(DividendPayment.getCodeName().get(), DividendPayment);
		codesByName.put(CorporationActionEvent.getCodeName().get(), CorporationActionEvent);
		codesByName.put(CrossIn.getCodeName().get(), CrossIn);
		codesByName.put(CrossOut.getCodeName().get(), CrossOut);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(InSpecie.getCodeName().get(), InSpecie);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(RedemptionAssetAllocation.getCodeName().get(), RedemptionAssetAllocation);
		codesByName.put(RedemptionWithdrawingPlan.getCodeName().get(), RedemptionWithdrawingPlan);
		codesByName.put(ReinvestmentOfDividend.getCodeName().get(), ReinvestmentOfDividend);
		codesByName.put(SubscriptionSavingsPlan.getCodeName().get(), SubscriptionSavingsPlan);
		codesByName.put(SubscriptionAssetAllocation.getCodeName().get(), SubscriptionAssetAllocation);
	}

	public static InvestmentFundTransactionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundTransactionType1Code[] values() {
		InvestmentFundTransactionType1Code[] values = new InvestmentFundTransactionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundTransactionType1Code> {
		@Override
		public InvestmentFundTransactionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundTransactionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}