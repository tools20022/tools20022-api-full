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
import com.tools20022.repository.codeset.SpecialPurposeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies special purpose codes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SpecialPurposeCode#Blank
 * SpecialPurposeCode.Blank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialPurposeCode#NotAvailable
 * SpecialPurposeCode.NotAvailable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SpecialPurposeCode#AnyMIC
 * SpecialPurposeCode.AnyMIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialPurposeCode#NotReported
 * SpecialPurposeCode.NotReported}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AnyMIC1Code AnyMIC1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NotAvailable1Code
 * NotAvailable1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NotReported1Code
 * NotReported1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SpecialPurposeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies special purpose codes."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SpecialPurposeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Blank value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialPurposeCode
	 * SpecialPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLNK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Blank value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialPurposeCode Blank = new SpecialPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blank";
			definition = "Blank value.";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialPurposeCode.mmObject();
			codeName = "BLNK";
		}
	};
	/**
	 * Not available (N/A).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialPurposeCode
	 * SpecialPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NTAV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not available (N/A)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialPurposeCode NotAvailable = new SpecialPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			definition = "Not available (N/A).";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialPurposeCode.mmObject();
			codeName = "NTAV";
		}
	};
	/**
	 * Any MIC code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialPurposeCode
	 * SpecialPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANYM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyMIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Any MIC code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialPurposeCode AnyMIC = new SpecialPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyMIC";
			definition = "Any MIC code.";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialPurposeCode.mmObject();
			codeName = "ANYM";
		}
	};
	/**
	 * Value not reported by the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialPurposeCode
	 * SpecialPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value not reported by the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialPurposeCode NotReported = new SpecialPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReported";
			definition = "Value not reported by the party.";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialPurposeCode.mmObject();
			codeName = "NORP";
		}
	};
	final static private LinkedHashMap<String, SpecialPurposeCode> codesByName = new LinkedHashMap<>();

	protected SpecialPurposeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SpecialPurposeCode";
				definition = "Specifies special purpose codes.";
				derivation_lazy = () -> Arrays.asList(AnyMIC1Code.mmObject(), NotAvailable1Code.mmObject(), NotReported1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SpecialPurposeCode.Blank, com.tools20022.repository.codeset.SpecialPurposeCode.NotAvailable, com.tools20022.repository.codeset.SpecialPurposeCode.AnyMIC,
						com.tools20022.repository.codeset.SpecialPurposeCode.NotReported);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blank.getCodeName().get(), Blank);
		codesByName.put(NotAvailable.getCodeName().get(), NotAvailable);
		codesByName.put(AnyMIC.getCodeName().get(), AnyMIC);
		codesByName.put(NotReported.getCodeName().get(), NotReported);
	}

	public static SpecialPurposeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SpecialPurposeCode[] values() {
		SpecialPurposeCode[] values = new SpecialPurposeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SpecialPurposeCode> {
		@Override
		public SpecialPurposeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SpecialPurposeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}