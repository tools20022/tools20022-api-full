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
import com.tools20022.repository.codeset.MandateCancellationReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for requesting the cancellation of a mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code#IncorrectAgent
 * MandateCancellationReason1Code.IncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code#IncorrectCurrency
 * MandateCancellationReason1Code.IncorrectCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code#RequestedByCustomer
 * MandateCancellationReason1Code.RequestedByCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code#InsufficientDebtorDetails
 * MandateCancellationReason1Code.InsufficientDebtorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code#InsufficientCreditorDetails
 * MandateCancellationReason1Code.InsufficientCreditorDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MandateReasonCode
 * MandateReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGNT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateCancellationReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for requesting the cancellation of a mandate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MandateCancellationReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code
	 * MandateCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * </ul>
	 */
	public static final MandateCancellationReason1Code IncorrectAgent = new MandateCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateCancellationReason1Code.mmObject();
			codeName = MandateReasonCode.IncorrectAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code
	 * MandateCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCurrency"</li>
	 * </ul>
	 */
	public static final MandateCancellationReason1Code IncorrectCurrency = new MandateCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateCancellationReason1Code.mmObject();
			codeName = MandateReasonCode.IncorrectCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code
	 * MandateCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedByCustomer"</li>
	 * </ul>
	 */
	public static final MandateCancellationReason1Code RequestedByCustomer = new MandateCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateCancellationReason1Code.mmObject();
			codeName = MandateReasonCode.RequestedByCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code
	 * MandateCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientDebtorDetails"</li>
	 * </ul>
	 */
	public static final MandateCancellationReason1Code InsufficientDebtorDetails = new MandateCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateCancellationReason1Code.mmObject();
			codeName = MandateReasonCode.InsufficientDebtorDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MandateCancellationReason1Code
	 * MandateCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCreditorDetails"</li>
	 * </ul>
	 */
	public static final MandateCancellationReason1Code InsufficientCreditorDetails = new MandateCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.MandateCancellationReason1Code.mmObject();
			codeName = MandateReasonCode.InsufficientCreditorDetails.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MandateCancellationReason1Code> codesByName = new LinkedHashMap<>();

	protected MandateCancellationReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGNT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateCancellationReason1Code";
				definition = "Specifies the reason for requesting the cancellation of a mandate.";
				trace_lazy = () -> MandateReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MandateCancellationReason1Code.IncorrectAgent, com.tools20022.repository.codeset.MandateCancellationReason1Code.IncorrectCurrency,
						com.tools20022.repository.codeset.MandateCancellationReason1Code.RequestedByCustomer, com.tools20022.repository.codeset.MandateCancellationReason1Code.InsufficientDebtorDetails,
						com.tools20022.repository.codeset.MandateCancellationReason1Code.InsufficientCreditorDetails);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectAgent.getCodeName().get(), IncorrectAgent);
		codesByName.put(IncorrectCurrency.getCodeName().get(), IncorrectCurrency);
		codesByName.put(RequestedByCustomer.getCodeName().get(), RequestedByCustomer);
		codesByName.put(InsufficientDebtorDetails.getCodeName().get(), InsufficientDebtorDetails);
		codesByName.put(InsufficientCreditorDetails.getCodeName().get(), InsufficientCreditorDetails);
	}

	public static MandateCancellationReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MandateCancellationReason1Code[] values() {
		MandateCancellationReason1Code[] values = new MandateCancellationReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MandateCancellationReason1Code> {
		@Override
		public MandateCancellationReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MandateCancellationReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}