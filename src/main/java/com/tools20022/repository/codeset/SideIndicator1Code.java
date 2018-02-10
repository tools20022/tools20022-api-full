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
import com.tools20022.repository.codeset.SideIndicator1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.SideIndicator1Code#CCPLeg
 * SideIndicator1Code.CCPLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SideIndicator1Code#ClientLeg
 * SideIndicator1Code.ClientLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SideIndicatorCode
 * SideIndicatorCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CCPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SideIndicator1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "To indicate either the reference for the Central Counterparty (CCP) leg or the reference for the client leg of the transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SideIndicator1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideIndicator1Code
	 * SideIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPLeg"</li>
	 * </ul>
	 */
	public static final SideIndicator1Code CCPLeg = new SideIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPLeg";
			owner_lazy = () -> com.tools20022.repository.codeset.SideIndicator1Code.mmObject();
			codeName = SideIndicatorCode.CCPLeg.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SideIndicator1Code
	 * SideIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientLeg"</li>
	 * </ul>
	 */
	public static final SideIndicator1Code ClientLeg = new SideIndicator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientLeg";
			owner_lazy = () -> com.tools20022.repository.codeset.SideIndicator1Code.mmObject();
			codeName = SideIndicatorCode.ClientLeg.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SideIndicator1Code> codesByName = new LinkedHashMap<>();

	protected SideIndicator1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CCPL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SideIndicator1Code";
				definition = "To indicate either the reference for the Central Counterparty (CCP) leg or the reference for the client leg of the transaction.";
				trace_lazy = () -> SideIndicatorCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SideIndicator1Code.CCPLeg, com.tools20022.repository.codeset.SideIndicator1Code.ClientLeg);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CCPLeg.getCodeName().get(), CCPLeg);
		codesByName.put(ClientLeg.getCodeName().get(), ClientLeg);
	}

	public static SideIndicator1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SideIndicator1Code[] values() {
		SideIndicator1Code[] values = new SideIndicator1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SideIndicator1Code> {
		@Override
		public SideIndicator1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SideIndicator1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}