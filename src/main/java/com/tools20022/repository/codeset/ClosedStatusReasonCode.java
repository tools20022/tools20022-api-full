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
import com.tools20022.repository.codeset.ClosedStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the closed status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClosedStatusReasonCode#ClientInstruction
 * ClosedStatusReasonCode.ClientInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClosedStatusReasonCode#AccountServicerInstruction
 * ClosedStatusReasonCode.AccountServicerInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ClosedStatusReason1Code
 * ClosedStatusReason1Code}</li>
 * </ul>
 * </li>
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
 * "ClosedStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for the closed status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClosedStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is closed, following an instruction from the client, or an
	 * authorised party, to close the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClosedStatusReasonCode
	 * ClosedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is closed, following an instruction from the client, or an authorised party, to close the account."
	 * </li>
	 * </ul>
	 */
	public static final ClosedStatusReasonCode ClientInstruction = new ClosedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientInstruction";
			definition = "Account is closed, following an instruction from the client, or an authorised party, to close the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClosedStatusReasonCode.mmObject();
			codeName = "CLIN";
		}
	};
	/**
	 * Account is closed, following an instruction from the account servicer to
	 * close the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClosedStatusReasonCode
	 * ClosedStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is closed, following an instruction from the account servicer to close the account."
	 * </li>
	 * </ul>
	 */
	public static final ClosedStatusReasonCode AccountServicerInstruction = new ClosedStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerInstruction";
			definition = "Account is closed, following an instruction from the account servicer to close the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClosedStatusReasonCode.mmObject();
			codeName = "ASIN";
		}
	};
	final static private LinkedHashMap<String, ClosedStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected ClosedStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClosedStatusReasonCode";
				definition = "Specifies the reason for the closed status.";
				derivation_lazy = () -> Arrays.asList(ClosedStatusReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClosedStatusReasonCode.ClientInstruction, com.tools20022.repository.codeset.ClosedStatusReasonCode.AccountServicerInstruction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClientInstruction.getCodeName().get(), ClientInstruction);
		codesByName.put(AccountServicerInstruction.getCodeName().get(), AccountServicerInstruction);
	}

	public static ClosedStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClosedStatusReasonCode[] values() {
		ClosedStatusReasonCode[] values = new ClosedStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClosedStatusReasonCode> {
		@Override
		public ClosedStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClosedStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}