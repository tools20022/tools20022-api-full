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
import com.tools20022.repository.codeset.TypeTransactionTotals1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identification of the type of transactions which are included in the totals.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code#Debit
 * TypeTransactionTotals1Code.Debit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code#DebitReverse
 * TypeTransactionTotals1Code.DebitReverse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code#Credit
 * TypeTransactionTotals1Code.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code#CreditReverse
 * TypeTransactionTotals1Code.CreditReverse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotalsCode
 * TypeTransactionTotalsCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DEBT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeTransactionTotals1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the type of transactions which are included in the totals."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeTransactionTotals1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code
	 * TypeTransactionTotals1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * </ul>
	 */
	public static final TypeTransactionTotals1Code Debit = new TypeTransactionTotals1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeTransactionTotals1Code.mmObject();
			codeName = TypeTransactionTotalsCode.Debit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code
	 * TypeTransactionTotals1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitReverse"</li>
	 * </ul>
	 */
	public static final TypeTransactionTotals1Code DebitReverse = new TypeTransactionTotals1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitReverse";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeTransactionTotals1Code.mmObject();
			codeName = TypeTransactionTotalsCode.DebitReverse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code
	 * TypeTransactionTotals1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * </ul>
	 */
	public static final TypeTransactionTotals1Code Credit = new TypeTransactionTotals1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeTransactionTotals1Code.mmObject();
			codeName = TypeTransactionTotalsCode.Credit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeTransactionTotals1Code
	 * TypeTransactionTotals1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditReverse"</li>
	 * </ul>
	 */
	public static final TypeTransactionTotals1Code CreditReverse = new TypeTransactionTotals1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditReverse";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeTransactionTotals1Code.mmObject();
			codeName = TypeTransactionTotalsCode.CreditReverse.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeTransactionTotals1Code> codesByName = new LinkedHashMap<>();

	protected TypeTransactionTotals1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DEBT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeTransactionTotals1Code";
				definition = "Identification of the type of transactions which are included in the totals.";
				trace_lazy = () -> TypeTransactionTotalsCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeTransactionTotals1Code.Debit, com.tools20022.repository.codeset.TypeTransactionTotals1Code.DebitReverse,
						com.tools20022.repository.codeset.TypeTransactionTotals1Code.Credit, com.tools20022.repository.codeset.TypeTransactionTotals1Code.CreditReverse);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Debit.getCodeName().get(), Debit);
		codesByName.put(DebitReverse.getCodeName().get(), DebitReverse);
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(CreditReverse.getCodeName().get(), CreditReverse);
	}

	public static TypeTransactionTotals1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeTransactionTotals1Code[] values() {
		TypeTransactionTotals1Code[] values = new TypeTransactionTotals1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeTransactionTotals1Code> {
		@Override
		public TypeTransactionTotals1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeTransactionTotals1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}