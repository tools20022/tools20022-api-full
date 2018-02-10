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
import com.tools20022.repository.codeset.ATMCassetteType1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code#In
 * ATMCassetteType1Code.In}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code#Out
 * ATMCassetteType1Code.Out}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code#Recycling
 * ATMCassetteType1Code.Recycling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code#Reject
 * ATMCassetteType1Code.Reject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code#Replenishment
 * ATMCassetteType1Code.Replenishment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code#Retract
 * ATMCassetteType1Code.Retract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMCassetteTypeCode
 * ATMCassetteTypeCode}</li>
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
 * "ATMCassetteType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cassette."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCassetteType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
	 * ATMCassetteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "In"</li>
	 * </ul>
	 */
	public static final ATMCassetteType1Code In = new ATMCassetteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "In";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteType1Code.mmObject();
			codeName = ATMCassetteTypeCode.In.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
	 * ATMCassetteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Out"</li>
	 * </ul>
	 */
	public static final ATMCassetteType1Code Out = new ATMCassetteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Out";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteType1Code.mmObject();
			codeName = ATMCassetteTypeCode.Out.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
	 * ATMCassetteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recycling"</li>
	 * </ul>
	 */
	public static final ATMCassetteType1Code Recycling = new ATMCassetteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recycling";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteType1Code.mmObject();
			codeName = ATMCassetteTypeCode.Recycling.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
	 * ATMCassetteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reject"</li>
	 * </ul>
	 */
	public static final ATMCassetteType1Code Reject = new ATMCassetteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reject";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteType1Code.mmObject();
			codeName = ATMCassetteTypeCode.Reject.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
	 * ATMCassetteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replenishment"</li>
	 * </ul>
	 */
	public static final ATMCassetteType1Code Replenishment = new ATMCassetteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replenishment";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteType1Code.mmObject();
			codeName = ATMCassetteTypeCode.Replenishment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCassetteType1Code
	 * ATMCassetteType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retract"</li>
	 * </ul>
	 */
	public static final ATMCassetteType1Code Retract = new ATMCassetteType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Retract";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCassetteType1Code.mmObject();
			codeName = ATMCassetteTypeCode.Retract.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMCassetteType1Code> codesByName = new LinkedHashMap<>();

	protected ATMCassetteType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassetteType1Code";
				definition = "Type of cassette.";
				trace_lazy = () -> ATMCassetteTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCassetteType1Code.In, com.tools20022.repository.codeset.ATMCassetteType1Code.Out, com.tools20022.repository.codeset.ATMCassetteType1Code.Recycling,
						com.tools20022.repository.codeset.ATMCassetteType1Code.Reject, com.tools20022.repository.codeset.ATMCassetteType1Code.Replenishment, com.tools20022.repository.codeset.ATMCassetteType1Code.Retract);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(In.getCodeName().get(), In);
		codesByName.put(Out.getCodeName().get(), Out);
		codesByName.put(Recycling.getCodeName().get(), Recycling);
		codesByName.put(Reject.getCodeName().get(), Reject);
		codesByName.put(Replenishment.getCodeName().get(), Replenishment);
		codesByName.put(Retract.getCodeName().get(), Retract);
	}

	public static ATMCassetteType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCassetteType1Code[] values() {
		ATMCassetteType1Code[] values = new ATMCassetteType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCassetteType1Code> {
		@Override
		public ATMCassetteType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCassetteType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}