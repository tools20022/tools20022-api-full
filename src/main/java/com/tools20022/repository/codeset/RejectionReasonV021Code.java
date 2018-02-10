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
import com.tools20022.repository.codeset.RejectionReasonV021Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#InvalidSecurity
 * RejectionReasonV021Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#UnrecognisedIdentification
 * RejectionReasonV021Code.UnrecognisedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#UnknownSymbol
 * RejectionReasonV021Code.UnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#InsufficientCollateral
 * RejectionReasonV021Code.InsufficientCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#ConcentrationLimitExceeded
 * RejectionReasonV021Code.ConcentrationLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#NonEligibleSecurity
 * RejectionReasonV021Code.NonEligibleSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#InvalidIdentification
 * RejectionReasonV021Code.InvalidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code#Other
 * RejectionReasonV021Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
 * RejectionReasonV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DSEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReasonV021Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReasonV021Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code InvalidSecurity = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code UnrecognisedIdentification = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.UnrecognisedIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code UnknownSymbol = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.UnknownSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCollateral"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code InsufficientCollateral = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.InsufficientCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcentrationLimitExceeded"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code ConcentrationLimitExceeded = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcentrationLimitExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.ConcentrationLimitExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code NonEligibleSecurity = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.NonEligibleSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code InvalidIdentification = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final RejectionReasonV021Code Other = new RejectionReasonV021Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV021Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReasonV021Code> codesByName = new LinkedHashMap<>();

	protected RejectionReasonV021Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DSEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReasonV021Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReasonV021Code.InvalidSecurity, com.tools20022.repository.codeset.RejectionReasonV021Code.UnrecognisedIdentification,
						com.tools20022.repository.codeset.RejectionReasonV021Code.UnknownSymbol, com.tools20022.repository.codeset.RejectionReasonV021Code.InsufficientCollateral,
						com.tools20022.repository.codeset.RejectionReasonV021Code.ConcentrationLimitExceeded, com.tools20022.repository.codeset.RejectionReasonV021Code.NonEligibleSecurity,
						com.tools20022.repository.codeset.RejectionReasonV021Code.InvalidIdentification, com.tools20022.repository.codeset.RejectionReasonV021Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(UnrecognisedIdentification.getCodeName().get(), UnrecognisedIdentification);
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(InsufficientCollateral.getCodeName().get(), InsufficientCollateral);
		codesByName.put(ConcentrationLimitExceeded.getCodeName().get(), ConcentrationLimitExceeded);
		codesByName.put(NonEligibleSecurity.getCodeName().get(), NonEligibleSecurity);
		codesByName.put(InvalidIdentification.getCodeName().get(), InvalidIdentification);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static RejectionReasonV021Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReasonV021Code[] values() {
		RejectionReasonV021Code[] values = new RejectionReasonV021Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReasonV021Code> {
		@Override
		public RejectionReasonV021Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReasonV021Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}