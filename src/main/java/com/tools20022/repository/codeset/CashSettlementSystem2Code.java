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
import com.tools20022.repository.codeset.CashSettlementSystem2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the cash settlement system used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem2Code#GrossSettlementSystem
 * CashSettlementSystem2Code.GrossSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem2Code#NetSettlementSystem
 * CashSettlementSystem2Code.NetSettlementSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
 * CashSettlementSystemCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GROS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashSettlementSystem2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash settlement system used."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashSettlementSystem2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem2Code
	 * CashSettlementSystem2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossSettlementSystem"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem2Code GrossSettlementSystem = new CashSettlementSystem2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossSettlementSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem2Code.mmObject();
			codeName = CashSettlementSystemCode.GrossSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystem2Code
	 * CashSettlementSystem2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSettlementSystem"</li>
	 * </ul>
	 */
	public static final CashSettlementSystem2Code NetSettlementSystem = new CashSettlementSystem2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSettlementSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystem2Code.mmObject();
			codeName = CashSettlementSystemCode.NetSettlementSystem.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashSettlementSystem2Code> codesByName = new LinkedHashMap<>();

	protected CashSettlementSystem2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlementSystem2Code";
				definition = "Specifies the cash settlement system used.";
				trace_lazy = () -> CashSettlementSystemCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashSettlementSystem2Code.GrossSettlementSystem, com.tools20022.repository.codeset.CashSettlementSystem2Code.NetSettlementSystem);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GrossSettlementSystem.getCodeName().get(), GrossSettlementSystem);
		codesByName.put(NetSettlementSystem.getCodeName().get(), NetSettlementSystem);
	}

	public static CashSettlementSystem2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashSettlementSystem2Code[] values() {
		CashSettlementSystem2Code[] values = new CashSettlementSystem2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashSettlementSystem2Code> {
		@Override
		public CashSettlementSystem2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashSettlementSystem2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}