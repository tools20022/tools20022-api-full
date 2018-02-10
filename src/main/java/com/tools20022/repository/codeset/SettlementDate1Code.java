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
import com.tools20022.repository.codeset.SettlementDate1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the date of settlement in coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate1Code#AsSoonAsPossible
 * SettlementDate1Code.AsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate1Code#AtEndOfContract
 * SettlementDate1Code.AtEndOfContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate1Code#WhenAndIfIssued
 * SettlementDate1Code.WhenAndIfIssued}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
 * SettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ASAP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDate1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the date of settlement in coded form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementDate1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate1Code
	 * SettlementDate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * </ul>
	 */
	public static final SettlementDate1Code AsSoonAsPossible = new SettlementDate1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsSoonAsPossible";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate1Code.mmObject();
			codeName = SettlementDateCode.AsSoonAsPossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate1Code
	 * SettlementDate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtEndOfContract"</li>
	 * </ul>
	 */
	public static final SettlementDate1Code AtEndOfContract = new SettlementDate1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AtEndOfContract";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate1Code.mmObject();
			codeName = SettlementDateCode.AtEndOfContract.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate1Code
	 * SettlementDate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenAndIfIssued"</li>
	 * </ul>
	 */
	public static final SettlementDate1Code WhenAndIfIssued = new SettlementDate1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenAndIfIssued";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate1Code.mmObject();
			codeName = SettlementDateCode.WhenAndIfIssued.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementDate1Code> codesByName = new LinkedHashMap<>();

	protected SettlementDate1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASAP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDate1Code";
				definition = "Indicates the date of settlement in coded form.";
				trace_lazy = () -> SettlementDateCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementDate1Code.AsSoonAsPossible, com.tools20022.repository.codeset.SettlementDate1Code.AtEndOfContract,
						com.tools20022.repository.codeset.SettlementDate1Code.WhenAndIfIssued);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AsSoonAsPossible.getCodeName().get(), AsSoonAsPossible);
		codesByName.put(AtEndOfContract.getCodeName().get(), AtEndOfContract);
		codesByName.put(WhenAndIfIssued.getCodeName().get(), WhenAndIfIssued);
	}

	public static SettlementDate1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementDate1Code[] values() {
		SettlementDate1Code[] values = new SettlementDate1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementDate1Code> {
		@Override
		public SettlementDate1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementDate1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}