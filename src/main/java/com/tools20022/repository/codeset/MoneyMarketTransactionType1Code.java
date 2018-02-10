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
import com.tools20022.repository.codeset.MoneyMarketTransactionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the transaction type used in the money market statistical reporting
 * for the secured market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionType1Code#CashBorrowing
 * MoneyMarketTransactionType1Code.CashBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionType1Code#CashLending
 * MoneyMarketTransactionType1Code.CashLending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode
 * MoneyMarketTransactionTypeCode}</li>
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
 * "MoneyMarketTransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the transaction type used in the money market statistical reporting for the secured market."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MoneyMarketTransactionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionType1Code
	 * MoneyMarketTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBorrowing"</li>
	 * </ul>
	 */
	public static final MoneyMarketTransactionType1Code CashBorrowing = new MoneyMarketTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyMarketTransactionType1Code.mmObject();
			codeName = MoneyMarketTransactionTypeCode.CashBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionType1Code
	 * MoneyMarketTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashLending"</li>
	 * </ul>
	 */
	public static final MoneyMarketTransactionType1Code CashLending = new MoneyMarketTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashLending";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyMarketTransactionType1Code.mmObject();
			codeName = MoneyMarketTransactionTypeCode.CashLending.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MoneyMarketTransactionType1Code> codesByName = new LinkedHashMap<>();

	protected MoneyMarketTransactionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketTransactionType1Code";
				definition = "Specifies the transaction type used in the money market statistical reporting for the secured market.";
				trace_lazy = () -> MoneyMarketTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MoneyMarketTransactionType1Code.CashBorrowing, com.tools20022.repository.codeset.MoneyMarketTransactionType1Code.CashLending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashBorrowing.getCodeName().get(), CashBorrowing);
		codesByName.put(CashLending.getCodeName().get(), CashLending);
	}

	public static MoneyMarketTransactionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MoneyMarketTransactionType1Code[] values() {
		MoneyMarketTransactionType1Code[] values = new MoneyMarketTransactionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MoneyMarketTransactionType1Code> {
		@Override
		public MoneyMarketTransactionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MoneyMarketTransactionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}