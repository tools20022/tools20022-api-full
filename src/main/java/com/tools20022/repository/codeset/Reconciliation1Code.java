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
import com.tools20022.repository.codeset.Reconciliation1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the process type used for the trade repository reconciliation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code#DualSidedMatched
 * Reconciliation1Code.DualSidedMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code#DualSidedNonMatched
 * Reconciliation1Code.DualSidedNonMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code#NotSubmittedToReconciliation
 * Reconciliation1Code.NotSubmittedToReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code#SingleSidedEEAMatched
 * Reconciliation1Code.SingleSidedEEAMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code#SingleSidedEEAPaired
 * Reconciliation1Code.SingleSidedEEAPaired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code#SingleSidedNonEEA
 * Reconciliation1Code.SingleSidedNonEEA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code#SingleSidedEEAUnpaired
 * Reconciliation1Code.SingleSidedEEAUnpaired}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
 * ReconciliationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reconciliation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the process type used for the trade repository reconciliation."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Reconciliation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code
	 * Reconciliation1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualSidedMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Reconciliation1Code DualSidedMatched = new Reconciliation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualSidedMatched";
			owner_lazy = () -> com.tools20022.repository.codeset.Reconciliation1Code.mmObject();
			codeName = ReconciliationCode.DualSidedMatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code
	 * Reconciliation1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualSidedNonMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Reconciliation1Code DualSidedNonMatched = new Reconciliation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualSidedNonMatched";
			owner_lazy = () -> com.tools20022.repository.codeset.Reconciliation1Code.mmObject();
			codeName = ReconciliationCode.DualSidedNonMatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code
	 * Reconciliation1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSubmittedToReconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Reconciliation1Code NotSubmittedToReconciliation = new Reconciliation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSubmittedToReconciliation";
			owner_lazy = () -> com.tools20022.repository.codeset.Reconciliation1Code.mmObject();
			codeName = ReconciliationCode.NotSubmittedToReconciliation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code
	 * Reconciliation1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedEEAMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Reconciliation1Code SingleSidedEEAMatched = new Reconciliation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedEEAMatched";
			owner_lazy = () -> com.tools20022.repository.codeset.Reconciliation1Code.mmObject();
			codeName = ReconciliationCode.SingleSidedEEAMatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code
	 * Reconciliation1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedEEAPaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Reconciliation1Code SingleSidedEEAPaired = new Reconciliation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedEEAPaired";
			owner_lazy = () -> com.tools20022.repository.codeset.Reconciliation1Code.mmObject();
			codeName = ReconciliationCode.SingleSidedEEAPaired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code
	 * Reconciliation1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedNonEEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Reconciliation1Code SingleSidedNonEEA = new Reconciliation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedNonEEA";
			owner_lazy = () -> com.tools20022.repository.codeset.Reconciliation1Code.mmObject();
			codeName = ReconciliationCode.SingleSidedNonEEA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Reconciliation1Code
	 * Reconciliation1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedEEAUnpaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Reconciliation1Code SingleSidedEEAUnpaired = new Reconciliation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedEEAUnpaired";
			owner_lazy = () -> com.tools20022.repository.codeset.Reconciliation1Code.mmObject();
			codeName = ReconciliationCode.SingleSidedEEAUnpaired.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Reconciliation1Code> codesByName = new LinkedHashMap<>();

	protected Reconciliation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reconciliation1Code";
				definition = "Specifies the process type used for the trade repository reconciliation.";
				trace_lazy = () -> ReconciliationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Reconciliation1Code.DualSidedMatched, com.tools20022.repository.codeset.Reconciliation1Code.DualSidedNonMatched,
						com.tools20022.repository.codeset.Reconciliation1Code.NotSubmittedToReconciliation, com.tools20022.repository.codeset.Reconciliation1Code.SingleSidedEEAMatched,
						com.tools20022.repository.codeset.Reconciliation1Code.SingleSidedEEAPaired, com.tools20022.repository.codeset.Reconciliation1Code.SingleSidedNonEEA,
						com.tools20022.repository.codeset.Reconciliation1Code.SingleSidedEEAUnpaired);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DualSidedMatched.getCodeName().get(), DualSidedMatched);
		codesByName.put(DualSidedNonMatched.getCodeName().get(), DualSidedNonMatched);
		codesByName.put(NotSubmittedToReconciliation.getCodeName().get(), NotSubmittedToReconciliation);
		codesByName.put(SingleSidedEEAMatched.getCodeName().get(), SingleSidedEEAMatched);
		codesByName.put(SingleSidedEEAPaired.getCodeName().get(), SingleSidedEEAPaired);
		codesByName.put(SingleSidedNonEEA.getCodeName().get(), SingleSidedNonEEA);
		codesByName.put(SingleSidedEEAUnpaired.getCodeName().get(), SingleSidedEEAUnpaired);
	}

	public static Reconciliation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Reconciliation1Code[] values() {
		Reconciliation1Code[] values = new Reconciliation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Reconciliation1Code> {
		@Override
		public Reconciliation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Reconciliation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}