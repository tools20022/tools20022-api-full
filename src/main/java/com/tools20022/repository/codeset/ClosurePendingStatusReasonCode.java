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
import com.tools20022.repository.codeset.ClosurePendingStatusReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReasonCode#PendingConditions
 * ClosurePendingStatusReasonCode.PendingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReasonCode#AccountClosingInProcess
 * ClosurePendingStatusReasonCode.AccountClosingInProcess}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReason1Code
 * ClosurePendingStatusReason1Code}</li>
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
 * "ClosurePendingStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for the closure pending status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClosurePendingStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account will be closed when conditions are met.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReasonCode
	 * ClosurePendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account will be closed when conditions are met."</li>
	 * </ul>
	 */
	public static final ClosurePendingStatusReasonCode PendingConditions = new ClosurePendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConditions";
			definition = "Account will be closed when conditions are met.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClosurePendingStatusReasonCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Account closing is in process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClosurePendingStatusReasonCode
	 * ClosurePendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountClosingInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account closing is in process."</li>
	 * </ul>
	 */
	public static final ClosurePendingStatusReasonCode AccountClosingInProcess = new ClosurePendingStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosingInProcess";
			definition = "Account closing is in process.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClosurePendingStatusReasonCode.mmObject();
			codeName = "CLOS";
		}
	};
	final static private LinkedHashMap<String, ClosurePendingStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected ClosurePendingStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClosurePendingStatusReasonCode";
				definition = "Specifies the reason for the closure pending status.";
				derivation_lazy = () -> Arrays.asList(ClosurePendingStatusReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClosurePendingStatusReasonCode.PendingConditions, com.tools20022.repository.codeset.ClosurePendingStatusReasonCode.AccountClosingInProcess);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PendingConditions.getCodeName().get(), PendingConditions);
		codesByName.put(AccountClosingInProcess.getCodeName().get(), AccountClosingInProcess);
	}

	public static ClosurePendingStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClosurePendingStatusReasonCode[] values() {
		ClosurePendingStatusReasonCode[] values = new ClosurePendingStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClosurePendingStatusReasonCode> {
		@Override
		public ClosurePendingStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClosurePendingStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}