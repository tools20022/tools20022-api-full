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

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SettlementInstructionReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#AllCredits
 * SettlementInstructionReason1Code.AllCredits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#AllCreditsAndDebits
 * SettlementInstructionReason1Code.AllCreditsAndDebits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#AllDebits
 * SettlementInstructionReason1Code.AllDebits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#Charges
 * SettlementInstructionReason1Code.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#Dividend
 * SettlementInstructionReason1Code.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#Interest
 * SettlementInstructionReason1Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#InvestmentSavingsPlan
 * SettlementInstructionReason1Code.InvestmentSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#Redemption
 * SettlementInstructionReason1Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#SavingsPlan
 * SettlementInstructionReason1Code.SavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#SecuritiesPurchase
 * SettlementInstructionReason1Code.SecuritiesPurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#SecuritiesSale
 * SettlementInstructionReason1Code.SecuritiesSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#Subscription
 * SettlementInstructionReason1Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#WithdrawalSavingsPlan
 * SettlementInstructionReason1Code.WithdrawalSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code#CorporateAction
 * SettlementInstructionReason1Code.CorporateAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
 * SettlementInstructionReasonCode}</li>
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
 * "SettlementInstructionReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementInstructionReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllCredits"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code AllCredits = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCredits";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.AllCredits.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllCreditsAndDebits"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code AllCreditsAndDebits = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCreditsAndDebits";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.AllCreditsAndDebits.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllDebits"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code AllDebits = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllDebits";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.AllDebits.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code Charges = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.Charges.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code Dividend = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.Dividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code Interest = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentSavingsPlan"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code InvestmentSavingsPlan = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.InvestmentSavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code Redemption = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsPlan"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code SavingsPlan = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.SavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPurchase"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code SecuritiesPurchase = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.SecuritiesPurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSale"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code SecuritiesSale = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.SecuritiesSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code Subscription = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalSavingsPlan"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code WithdrawalSavingsPlan = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalSavingsPlan";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.WithdrawalSavingsPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
	 * SettlementInstructionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * </ul>
	 */
	public static final SettlementInstructionReason1Code CorporateAction = new SettlementInstructionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReason1Code.mmObject();
			codeName = SettlementInstructionReasonCode.CorporateAction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementInstructionReason1Code> codesByName = new LinkedHashMap<>();

	protected SettlementInstructionReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionReason1Code";
				definition = "Specifies the type of transaction.";
				trace_lazy = () -> SettlementInstructionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionReason1Code.AllCredits, com.tools20022.repository.codeset.SettlementInstructionReason1Code.AllCreditsAndDebits,
						com.tools20022.repository.codeset.SettlementInstructionReason1Code.AllDebits, com.tools20022.repository.codeset.SettlementInstructionReason1Code.Charges,
						com.tools20022.repository.codeset.SettlementInstructionReason1Code.Dividend, com.tools20022.repository.codeset.SettlementInstructionReason1Code.Interest,
						com.tools20022.repository.codeset.SettlementInstructionReason1Code.InvestmentSavingsPlan, com.tools20022.repository.codeset.SettlementInstructionReason1Code.Redemption,
						com.tools20022.repository.codeset.SettlementInstructionReason1Code.SavingsPlan, com.tools20022.repository.codeset.SettlementInstructionReason1Code.SecuritiesPurchase,
						com.tools20022.repository.codeset.SettlementInstructionReason1Code.SecuritiesSale, com.tools20022.repository.codeset.SettlementInstructionReason1Code.Subscription,
						com.tools20022.repository.codeset.SettlementInstructionReason1Code.WithdrawalSavingsPlan, com.tools20022.repository.codeset.SettlementInstructionReason1Code.CorporateAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllCredits.getCodeName().get(), AllCredits);
		codesByName.put(AllCreditsAndDebits.getCodeName().get(), AllCreditsAndDebits);
		codesByName.put(AllDebits.getCodeName().get(), AllDebits);
		codesByName.put(Charges.getCodeName().get(), Charges);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(InvestmentSavingsPlan.getCodeName().get(), InvestmentSavingsPlan);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(SavingsPlan.getCodeName().get(), SavingsPlan);
		codesByName.put(SecuritiesPurchase.getCodeName().get(), SecuritiesPurchase);
		codesByName.put(SecuritiesSale.getCodeName().get(), SecuritiesSale);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(WithdrawalSavingsPlan.getCodeName().get(), WithdrawalSavingsPlan);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
	}

	public static SettlementInstructionReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementInstructionReason1Code[] values() {
		SettlementInstructionReason1Code[] values = new SettlementInstructionReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementInstructionReason1Code> {
		@Override
		public SettlementInstructionReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementInstructionReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}