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
import com.tools20022.repository.codeset.ATMCassetteTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode#In
 * ATMCassetteTypeCode.In}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode#Out
 * ATMCassetteTypeCode.Out}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode#Recycling
 * ATMCassetteTypeCode.Recycling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode#Replenishment
 * ATMCassetteTypeCode.Replenishment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode#Reject
 * ATMCassetteTypeCode.Reject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode#Retract
 * ATMCassetteTypeCode.Retract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
 * ATMCassetteType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCassetteTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cassette."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCassetteTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cassette for deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode
	 * ATMCassetteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "In"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cassette for deposits."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCassetteTypeCode In = new ATMCassetteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "In";
			definition = "Cassette for deposits.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteTypeCode.mmObject();
			codeName = "DPST";
		}
	};
	/**
	 * Cassette for dispense.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode
	 * ATMCassetteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Out"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cassette for dispense."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCassetteTypeCode Out = new ATMCassetteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Out";
			definition = "Cassette for dispense.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteTypeCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Cassette for recycling.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode
	 * ATMCassetteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCYC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recycling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cassette for recycling."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCassetteTypeCode Recycling = new ATMCassetteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recycling";
			definition = "Cassette for recycling.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteTypeCode.mmObject();
			codeName = "RCYC";
		}
	};
	/**
	 * Cassette for replenishment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode
	 * ATMCassetteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPLT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replenishment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cassette for replenishment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCassetteTypeCode Replenishment = new ATMCassetteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replenishment";
			definition = "Cassette for replenishment.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteTypeCode.mmObject();
			codeName = "RPLT";
		}
	};
	/**
	 * Cassette for reject.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode
	 * ATMCassetteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cassette for reject."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCassetteTypeCode Reject = new ATMCassetteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reject";
			definition = "Cassette for reject.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteTypeCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Cassette for retract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode
	 * ATMCassetteTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTRC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cassette for retract."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCassetteTypeCode Retract = new ATMCassetteTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Retract";
			definition = "Cassette for retract.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteTypeCode.mmObject();
			codeName = "RTRC";
		}
	};
	final static private LinkedHashMap<String, ATMCassetteTypeCode> codesByName = new LinkedHashMap<>();

	protected ATMCassetteTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassetteTypeCode";
				definition = "Type of cassette.";
				derivation_lazy = () -> Arrays.asList(ATMCassetteType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCassetteTypeCode.In, com.tools20022.repository.codeset.ATMCassetteTypeCode.Out, com.tools20022.repository.codeset.ATMCassetteTypeCode.Recycling,
						com.tools20022.repository.codeset.ATMCassetteTypeCode.Replenishment, com.tools20022.repository.codeset.ATMCassetteTypeCode.Reject, com.tools20022.repository.codeset.ATMCassetteTypeCode.Retract);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(In.getCodeName().get(), In);
		codesByName.put(Out.getCodeName().get(), Out);
		codesByName.put(Recycling.getCodeName().get(), Recycling);
		codesByName.put(Replenishment.getCodeName().get(), Replenishment);
		codesByName.put(Reject.getCodeName().get(), Reject);
		codesByName.put(Retract.getCodeName().get(), Retract);
	}

	public static ATMCassetteTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCassetteTypeCode[] values() {
		ATMCassetteTypeCode[] values = new ATMCassetteTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCassetteTypeCode> {
		@Override
		public ATMCassetteTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCassetteTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}