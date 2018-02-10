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
import com.tools20022.repository.codeset.TerminationReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the termination reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code#ReductionTermsFulfilled
 * TerminationReason1Code.ReductionTermsFulfilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code#TenderNonAcceptance
 * TerminationReason1Code.TenderNonAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code#UnderlyingBusinessFinished
 * TerminationReason1Code.UnderlyingBusinessFinished}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code#WarrantyObligationPeriodExpired
 * TerminationReason1Code.WarrantyObligationPeriodExpired}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminationReasonCode
 * TerminationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REFU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminationReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the termination reason."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminationReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code
	 * TerminationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReductionTermsFulfilled"</li>
	 * </ul>
	 */
	public static final TerminationReason1Code ReductionTermsFulfilled = new TerminationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReductionTermsFulfilled";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReason1Code.mmObject();
			codeName = TerminationReasonCode.ReductionTermsFulfilled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code
	 * TerminationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderNonAcceptance"</li>
	 * </ul>
	 */
	public static final TerminationReason1Code TenderNonAcceptance = new TerminationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderNonAcceptance";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReason1Code.mmObject();
			codeName = TerminationReasonCode.TenderNonAcceptance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code
	 * TerminationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingBusinessFinished"</li>
	 * </ul>
	 */
	public static final TerminationReason1Code UnderlyingBusinessFinished = new TerminationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingBusinessFinished";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReason1Code.mmObject();
			codeName = TerminationReasonCode.UnderlyingBusinessFinished.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationReason1Code
	 * TerminationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantyObligationPeriodExpired"</li>
	 * </ul>
	 */
	public static final TerminationReason1Code WarrantyObligationPeriodExpired = new TerminationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantyObligationPeriodExpired";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationReason1Code.mmObject();
			codeName = TerminationReasonCode.WarrantyObligationPeriodExpired.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminationReason1Code> codesByName = new LinkedHashMap<>();

	protected TerminationReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REFU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminationReason1Code";
				definition = "Specifies the termination reason.";
				trace_lazy = () -> TerminationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminationReason1Code.ReductionTermsFulfilled, com.tools20022.repository.codeset.TerminationReason1Code.TenderNonAcceptance,
						com.tools20022.repository.codeset.TerminationReason1Code.UnderlyingBusinessFinished, com.tools20022.repository.codeset.TerminationReason1Code.WarrantyObligationPeriodExpired);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReductionTermsFulfilled.getCodeName().get(), ReductionTermsFulfilled);
		codesByName.put(TenderNonAcceptance.getCodeName().get(), TenderNonAcceptance);
		codesByName.put(UnderlyingBusinessFinished.getCodeName().get(), UnderlyingBusinessFinished);
		codesByName.put(WarrantyObligationPeriodExpired.getCodeName().get(), WarrantyObligationPeriodExpired);
	}

	public static TerminationReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminationReason1Code[] values() {
		TerminationReason1Code[] values = new TerminationReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminationReason1Code> {
		@Override
		public TerminationReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminationReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}