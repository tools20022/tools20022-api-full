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
import com.tools20022.repository.codeset.TransactionChannel2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of communication channel.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel2Code#FinancialAdvisor
 * TransactionChannel2Code.FinancialAdvisor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel2Code#HomeBanking
 * TransactionChannel2Code.HomeBanking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannel2Code#OfficeOrBranch
 * TransactionChannel2Code.OfficeOrBranch}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
 * TransactionChannelCode}</li>
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
 * "TransactionChannel2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of communication channel."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionChannel2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel2Code
	 * TransactionChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvisor"</li>
	 * </ul>
	 */
	public static final TransactionChannel2Code FinancialAdvisor = new TransactionChannel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvisor";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel2Code.mmObject();
			codeName = TransactionChannelCode.FinancialAdvisor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel2Code
	 * TransactionChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeBanking"</li>
	 * </ul>
	 */
	public static final TransactionChannel2Code HomeBanking = new TransactionChannel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeBanking";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel2Code.mmObject();
			codeName = TransactionChannelCode.HomeBanking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel2Code
	 * TransactionChannel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficeOrBranch"</li>
	 * </ul>
	 */
	public static final TransactionChannel2Code OfficeOrBranch = new TransactionChannel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficeOrBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannel2Code.mmObject();
			codeName = TransactionChannelCode.OfficeOrBranch.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionChannel2Code> codesByName = new LinkedHashMap<>();

	protected TransactionChannel2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionChannel2Code";
				definition = "Specifies the type of communication channel.";
				trace_lazy = () -> TransactionChannelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannel2Code.FinancialAdvisor, com.tools20022.repository.codeset.TransactionChannel2Code.HomeBanking,
						com.tools20022.repository.codeset.TransactionChannel2Code.OfficeOrBranch);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FinancialAdvisor.getCodeName().get(), FinancialAdvisor);
		codesByName.put(HomeBanking.getCodeName().get(), HomeBanking);
		codesByName.put(OfficeOrBranch.getCodeName().get(), OfficeOrBranch);
	}

	public static TransactionChannel2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionChannel2Code[] values() {
		TransactionChannel2Code[] values = new TransactionChannel2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionChannel2Code> {
		@Override
		public TransactionChannel2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionChannel2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}