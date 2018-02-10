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
import com.tools20022.repository.codeset.ClosurePendingStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the closure pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReason1Code#AccountClosingInProcess
 * ClosurePendingStatusReason1Code.AccountClosingInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReason1Code#PendingConditions
 * ClosurePendingStatusReason1Code.PendingConditions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReasonCode
 * ClosurePendingStatusReasonCode}</li>
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
 * "ClosurePendingStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for the closure pending status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClosurePendingStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReason1Code
	 * ClosurePendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountClosingInProcess"</li>
	 * </ul>
	 */
	public static final ClosurePendingStatusReason1Code AccountClosingInProcess = new ClosurePendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosingInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.ClosurePendingStatusReason1Code.mmObject();
			codeName = ClosurePendingStatusReasonCode.AccountClosingInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReason1Code
	 * ClosurePendingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConditions"</li>
	 * </ul>
	 */
	public static final ClosurePendingStatusReason1Code PendingConditions = new ClosurePendingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConditions";
			owner_lazy = () -> com.tools20022.repository.codeset.ClosurePendingStatusReason1Code.mmObject();
			codeName = ClosurePendingStatusReasonCode.PendingConditions.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ClosurePendingStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected ClosurePendingStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClosurePendingStatusReason1Code";
				definition = "Specifies the reason for the closure pending status.";
				trace_lazy = () -> ClosurePendingStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClosurePendingStatusReason1Code.AccountClosingInProcess, com.tools20022.repository.codeset.ClosurePendingStatusReason1Code.PendingConditions);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountClosingInProcess.getCodeName().get(), AccountClosingInProcess);
		codesByName.put(PendingConditions.getCodeName().get(), PendingConditions);
	}

	public static ClosurePendingStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClosurePendingStatusReason1Code[] values() {
		ClosurePendingStatusReason1Code[] values = new ClosurePendingStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClosurePendingStatusReason1Code> {
		@Override
		public ClosurePendingStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClosurePendingStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}