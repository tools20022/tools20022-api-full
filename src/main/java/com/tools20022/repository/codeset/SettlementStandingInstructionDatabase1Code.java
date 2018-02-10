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
import com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates what settlement standing instruction database is to be used to
 * derive the settlement parties involved in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code#InternalDatabase
 * SettlementStandingInstructionDatabase1Code.InternalDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code#BrokerDatabase
 * SettlementStandingInstructionDatabase1Code.BrokerDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code#VendorDatabase
 * SettlementStandingInstructionDatabase1Code.VendorDatabase}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode
 * SettlementStandingInstructionDatabaseCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INTE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementStandingInstructionDatabase1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementStandingInstructionDatabase1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code
	 * SettlementStandingInstructionDatabase1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalDatabase"</li>
	 * </ul>
	 */
	public static final SettlementStandingInstructionDatabase1Code InternalDatabase = new SettlementStandingInstructionDatabase1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalDatabase";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code.mmObject();
			codeName = SettlementStandingInstructionDatabaseCode.InternalDatabase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code
	 * SettlementStandingInstructionDatabase1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerDatabase"</li>
	 * </ul>
	 */
	public static final SettlementStandingInstructionDatabase1Code BrokerDatabase = new SettlementStandingInstructionDatabase1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerDatabase";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code.mmObject();
			codeName = SettlementStandingInstructionDatabaseCode.BrokerDatabase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code
	 * SettlementStandingInstructionDatabase1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorDatabase"</li>
	 * </ul>
	 */
	public static final SettlementStandingInstructionDatabase1Code VendorDatabase = new SettlementStandingInstructionDatabase1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorDatabase";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code.mmObject();
			codeName = SettlementStandingInstructionDatabaseCode.VendorDatabase.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementStandingInstructionDatabase1Code> codesByName = new LinkedHashMap<>();

	protected SettlementStandingInstructionDatabase1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStandingInstructionDatabase1Code";
				definition = "Indicates what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
				trace_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code.InternalDatabase, com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code.BrokerDatabase,
						com.tools20022.repository.codeset.SettlementStandingInstructionDatabase1Code.VendorDatabase);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InternalDatabase.getCodeName().get(), InternalDatabase);
		codesByName.put(BrokerDatabase.getCodeName().get(), BrokerDatabase);
		codesByName.put(VendorDatabase.getCodeName().get(), VendorDatabase);
	}

	public static SettlementStandingInstructionDatabase1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementStandingInstructionDatabase1Code[] values() {
		SettlementStandingInstructionDatabase1Code[] values = new SettlementStandingInstructionDatabase1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementStandingInstructionDatabase1Code> {
		@Override
		public SettlementStandingInstructionDatabase1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementStandingInstructionDatabase1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}