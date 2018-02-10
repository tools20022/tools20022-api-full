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
import com.tools20022.repository.codeset.SideIndicatorCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * To indicate either the reference for the Central Counterparty (CCP) leg or
 * the reference for the client leg of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SideIndicatorCode#ClientLeg
 * SideIndicatorCode.ClientLeg}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SideIndicatorCode#CCPLeg
 * SideIndicatorCode.CCPLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SideIndicator1Code
 * SideIndicator1Code}</li>
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
 * <li>"CLNT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SideIndicatorCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "To indicate either the reference for the Central Counterparty (CCP) leg or the reference for the client leg of the transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SideIndicatorCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Clearing broker identification is for the client leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideIndicatorCode
	 * SideIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing broker identification is for the client leg."</li>
	 * </ul>
	 */
	public static final SideIndicatorCode ClientLeg = new SideIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientLeg";
			definition = "Clearing broker identification is for the client leg.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideIndicatorCode.mmObject();
			codeName = "CLNT";
		}
	};
	/**
	 * Clearing broker identification is for the Central Counterparty (CCP) leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideIndicatorCode
	 * SideIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing broker identification is for the Central Counterparty (CCP) leg."
	 * </li>
	 * </ul>
	 */
	public static final SideIndicatorCode CCPLeg = new SideIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPLeg";
			definition = "Clearing broker identification is for the Central Counterparty (CCP) leg.";
			owner_lazy = () -> com.tools20022.repository.codeset.SideIndicatorCode.mmObject();
			codeName = "CCPL";
		}
	};
	final static private LinkedHashMap<String, SideIndicatorCode> codesByName = new LinkedHashMap<>();

	protected SideIndicatorCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLNT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SideIndicatorCode";
				definition = "To indicate either the reference for the Central Counterparty (CCP) leg or the reference for the client leg of the transaction.";
				derivation_lazy = () -> Arrays.asList(SideIndicator1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SideIndicatorCode.ClientLeg, com.tools20022.repository.codeset.SideIndicatorCode.CCPLeg);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClientLeg.getCodeName().get(), ClientLeg);
		codesByName.put(CCPLeg.getCodeName().get(), CCPLeg);
	}

	public static SideIndicatorCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SideIndicatorCode[] values() {
		SideIndicatorCode[] values = new SideIndicatorCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SideIndicatorCode> {
		@Override
		public SideIndicatorCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SideIndicatorCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}