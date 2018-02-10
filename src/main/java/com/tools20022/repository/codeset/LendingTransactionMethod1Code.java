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
import com.tools20022.repository.codeset.LendingTransactionMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Lending method applied to the securities financing contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethod1Code#OnDemandTrade
 * LendingTransactionMethod1Code.OnDemandTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethod1Code#ExclusiveTrade
 * LendingTransactionMethod1Code.ExclusiveTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethodCode
 * LendingTransactionMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ODTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LendingTransactionMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Lending method applied to the securities financing contract."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LendingTransactionMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethod1Code
	 * LendingTransactionMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemandTrade"</li>
	 * </ul>
	 */
	public static final LendingTransactionMethod1Code OnDemandTrade = new LendingTransactionMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnDemandTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.LendingTransactionMethod1Code.mmObject();
			codeName = LendingTransactionMethodCode.OnDemandTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethod1Code
	 * LendingTransactionMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusiveTrade"</li>
	 * </ul>
	 */
	public static final LendingTransactionMethod1Code ExclusiveTrade = new LendingTransactionMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.LendingTransactionMethod1Code.mmObject();
			codeName = LendingTransactionMethodCode.ExclusiveTrade.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LendingTransactionMethod1Code> codesByName = new LinkedHashMap<>();

	protected LendingTransactionMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ODTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LendingTransactionMethod1Code";
				definition = "Lending method applied to the securities financing contract.";
				trace_lazy = () -> LendingTransactionMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LendingTransactionMethod1Code.OnDemandTrade, com.tools20022.repository.codeset.LendingTransactionMethod1Code.ExclusiveTrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnDemandTrade.getCodeName().get(), OnDemandTrade);
		codesByName.put(ExclusiveTrade.getCodeName().get(), ExclusiveTrade);
	}

	public static LendingTransactionMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LendingTransactionMethod1Code[] values() {
		LendingTransactionMethod1Code[] values = new LendingTransactionMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LendingTransactionMethod1Code> {
		@Override
		public LendingTransactionMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LendingTransactionMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}