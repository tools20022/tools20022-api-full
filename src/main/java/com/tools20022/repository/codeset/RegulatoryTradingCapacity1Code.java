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
import com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regulatory trading capacity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code#MatchedPrincipal
 * RegulatoryTradingCapacity1Code.MatchedPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code#DealOnOwnAccount
 * RegulatoryTradingCapacity1Code.DealOnOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code#AnyOtherCapacity
 * RegulatoryTradingCapacity1Code.AnyOtherCapacity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacityCode
 * RegulatoryTradingCapacityCode}</li>
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
 * "RegulatoryTradingCapacity1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regulatory trading capacity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegulatoryTradingCapacity1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code
	 * RegulatoryTradingCapacity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedPrincipal"</li>
	 * </ul>
	 */
	public static final RegulatoryTradingCapacity1Code MatchedPrincipal = new RegulatoryTradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code.mmObject();
			codeName = RegulatoryTradingCapacityCode.MatchedPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code
	 * RegulatoryTradingCapacity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealOnOwnAccount"</li>
	 * </ul>
	 */
	public static final RegulatoryTradingCapacity1Code DealOnOwnAccount = new RegulatoryTradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealOnOwnAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code.mmObject();
			codeName = RegulatoryTradingCapacityCode.DealOnOwnAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code
	 * RegulatoryTradingCapacity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyOtherCapacity"</li>
	 * </ul>
	 */
	public static final RegulatoryTradingCapacity1Code AnyOtherCapacity = new RegulatoryTradingCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyOtherCapacity";
			owner_lazy = () -> com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code.mmObject();
			codeName = RegulatoryTradingCapacityCode.AnyOtherCapacity.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RegulatoryTradingCapacity1Code> codesByName = new LinkedHashMap<>();

	protected RegulatoryTradingCapacity1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTradingCapacity1Code";
				definition = "Specifies the regulatory trading capacity.";
				trace_lazy = () -> RegulatoryTradingCapacityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code.MatchedPrincipal, com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code.DealOnOwnAccount,
						com.tools20022.repository.codeset.RegulatoryTradingCapacity1Code.AnyOtherCapacity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MatchedPrincipal.getCodeName().get(), MatchedPrincipal);
		codesByName.put(DealOnOwnAccount.getCodeName().get(), DealOnOwnAccount);
		codesByName.put(AnyOtherCapacity.getCodeName().get(), AnyOtherCapacity);
	}

	public static RegulatoryTradingCapacity1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegulatoryTradingCapacity1Code[] values() {
		RegulatoryTradingCapacity1Code[] values = new RegulatoryTradingCapacity1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegulatoryTradingCapacity1Code> {
		@Override
		public RegulatoryTradingCapacity1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegulatoryTradingCapacity1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}