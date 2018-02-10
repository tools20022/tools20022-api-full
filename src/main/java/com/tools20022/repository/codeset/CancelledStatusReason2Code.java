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
import com.tools20022.repository.codeset.CancelledStatusReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying reason for cancellation of the associated
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code#CancelledByHub
 * CancelledStatusReason2Code.CancelledByHub}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code#CancelledByInstructingParty
 * CancelledStatusReason2Code.CancelledByInstructingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code#EndOfLife
 * CancelledStatusReason2Code.EndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code#CancelledByOther
 * CancelledStatusReason2Code.CancelledByOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
 * CancelledStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CANH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelledStatusReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for cancellation of the associated transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code
	 * CancelledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByHub"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason2Code CancelledByHub = new CancelledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByHub";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason2Code.mmObject();
			codeName = CancelledStatusReasonCode.CancelledByHub.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code
	 * CancelledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByInstructingParty"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason2Code CancelledByInstructingParty = new CancelledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByInstructingParty";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason2Code.mmObject();
			codeName = CancelledStatusReasonCode.CancelledByInstructingParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code
	 * CancelledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfLife"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason2Code EndOfLife = new CancelledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfLife";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason2Code.mmObject();
			codeName = CancelledStatusReasonCode.EndOfLife.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason2Code
	 * CancelledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByOther"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason2Code CancelledByOther = new CancelledStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByOther";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason2Code.mmObject();
			codeName = CancelledStatusReasonCode.CancelledByOther.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReason2Code> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReason2Code";
				definition = "Specifies the underlying reason for cancellation of the associated transaction.";
				trace_lazy = () -> CancelledStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReason2Code.CancelledByHub, com.tools20022.repository.codeset.CancelledStatusReason2Code.CancelledByInstructingParty,
						com.tools20022.repository.codeset.CancelledStatusReason2Code.EndOfLife, com.tools20022.repository.codeset.CancelledStatusReason2Code.CancelledByOther);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledByHub.getCodeName().get(), CancelledByHub);
		codesByName.put(CancelledByInstructingParty.getCodeName().get(), CancelledByInstructingParty);
		codesByName.put(EndOfLife.getCodeName().get(), EndOfLife);
		codesByName.put(CancelledByOther.getCodeName().get(), CancelledByOther);
	}

	public static CancelledStatusReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReason2Code[] values() {
		CancelledStatusReason2Code[] values = new CancelledStatusReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReason2Code> {
		@Override
		public CancelledStatusReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}