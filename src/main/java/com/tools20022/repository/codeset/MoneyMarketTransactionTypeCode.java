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
import com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the transaction type used in the money market statistical
 * reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode#CashBorrowing
 * MoneyMarketTransactionTypeCode.CashBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode#CashLending
 * MoneyMarketTransactionTypeCode.CashLending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionType1Code
 * MoneyMarketTransactionType1Code}</li>
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
 * "MoneyMarketTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the transaction type used in the money market statistical reporting."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MoneyMarketTransactionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode
	 * MoneyMarketTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a borrowing."</li>
	 * </ul>
	 */
	public static final MoneyMarketTransactionTypeCode CashBorrowing = new MoneyMarketTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBorrowing";
			definition = "Transaction is a borrowing.";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Transaction is a lending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode
	 * MoneyMarketTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a lending."</li>
	 * </ul>
	 */
	public static final MoneyMarketTransactionTypeCode CashLending = new MoneyMarketTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashLending";
			definition = "Transaction is a lending.";
			owner_lazy = () -> com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode.mmObject();
			codeName = "LEND";
		}
	};
	final static private LinkedHashMap<String, MoneyMarketTransactionTypeCode> codesByName = new LinkedHashMap<>();

	protected MoneyMarketTransactionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketTransactionTypeCode";
				definition = "Specifies the transaction type used in the money market statistical reporting.";
				derivation_lazy = () -> Arrays.asList(MoneyMarketTransactionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode.CashBorrowing, com.tools20022.repository.codeset.MoneyMarketTransactionTypeCode.CashLending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashBorrowing.getCodeName().get(), CashBorrowing);
		codesByName.put(CashLending.getCodeName().get(), CashLending);
	}

	public static MoneyMarketTransactionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MoneyMarketTransactionTypeCode[] values() {
		MoneyMarketTransactionTypeCode[] values = new MoneyMarketTransactionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MoneyMarketTransactionTypeCode> {
		@Override
		public MoneyMarketTransactionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MoneyMarketTransactionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}