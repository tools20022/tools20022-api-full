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
import com.tools20022.repository.codeset.CancellationRight1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the investor has the right to cancel an instruction or, if not,
 * the reason the investor cannot cancel.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code#Entitled
 * CancellationRight1Code.Entitled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code#ExecutionOnly
 * CancellationRight1Code.ExecutionOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code#WaiverAgreement
 * CancellationRight1Code.WaiverAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code#Institutional
 * CancellationRight1Code.Institutional}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
 * CancellationRightCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"VALI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationRight1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the investor has the right to cancel an instruction or, if not, the reason the investor cannot cancel."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancellationRight1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code
	 * CancellationRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitled"</li>
	 * </ul>
	 */
	public static final CancellationRight1Code Entitled = new CancellationRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entitled";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationRight1Code.mmObject();
			codeName = CancellationRightCode.Entitled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code
	 * CancellationRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionOnly"</li>
	 * </ul>
	 */
	public static final CancellationRight1Code ExecutionOnly = new CancellationRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationRight1Code.mmObject();
			codeName = CancellationRightCode.ExecutionOnly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code
	 * CancellationRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaiverAgreement"</li>
	 * </ul>
	 */
	public static final CancellationRight1Code WaiverAgreement = new CancellationRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaiverAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationRight1Code.mmObject();
			codeName = CancellationRightCode.WaiverAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code
	 * CancellationRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Institutional"</li>
	 * </ul>
	 */
	public static final CancellationRight1Code Institutional = new CancellationRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Institutional";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationRight1Code.mmObject();
			codeName = CancellationRightCode.Institutional.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancellationRight1Code> codesByName = new LinkedHashMap<>();

	protected CancellationRight1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("VALI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationRight1Code";
				definition = "Specifies if the investor has the right to cancel an instruction or, if not, the reason the investor cannot cancel.";
				trace_lazy = () -> CancellationRightCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationRight1Code.Entitled, com.tools20022.repository.codeset.CancellationRight1Code.ExecutionOnly,
						com.tools20022.repository.codeset.CancellationRight1Code.WaiverAgreement, com.tools20022.repository.codeset.CancellationRight1Code.Institutional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Entitled.getCodeName().get(), Entitled);
		codesByName.put(ExecutionOnly.getCodeName().get(), ExecutionOnly);
		codesByName.put(WaiverAgreement.getCodeName().get(), WaiverAgreement);
		codesByName.put(Institutional.getCodeName().get(), Institutional);
	}

	public static CancellationRight1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancellationRight1Code[] values() {
		CancellationRight1Code[] values = new CancellationRight1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancellationRight1Code> {
		@Override
		public CancellationRight1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancellationRight1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}