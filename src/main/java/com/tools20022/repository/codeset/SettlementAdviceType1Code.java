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
import com.tools20022.repository.codeset.SettlementAdviceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of settlement advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#UndertakingAmendment
 * SettlementAdviceType1Code.UndertakingAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#AutomaticChargesBooking
 * SettlementAdviceType1Code.AutomaticChargesBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#PaymentClaim
 * SettlementAdviceType1Code.PaymentClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#CorrespondentBankCharges
 * SettlementAdviceType1Code.CorrespondentBankCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#UndertakingIssuance
 * SettlementAdviceType1Code.UndertakingIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#ManualChargesBooking
 * SettlementAdviceType1Code.ManualChargesBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#Refund
 * SettlementAdviceType1Code.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code#Termination
 * SettlementAdviceType1Code.Termination}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceTypeCode
 * SettlementAdviceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementAdviceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of settlement advice."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AMND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementAdviceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code UndertakingAmendment = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendment";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.UndertakingAmendment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticChargesBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code AutomaticChargesBooking = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticChargesBooking";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.AutomaticChargesBooking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code PaymentClaim = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.PaymentClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondentBankCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code CorrespondentBankCharges = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankCharges";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.CorrespondentBankCharges.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code UndertakingIssuance = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuance";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.UndertakingIssuance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualChargesBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code ManualChargesBooking = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualChargesBooking";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.ManualChargesBooking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code Refund = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.Refund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementAdviceType1Code
	 * SettlementAdviceType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Termination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SettlementAdviceType1Code Termination = new SettlementAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementAdviceType1Code.mmObject();
			codeName = SettlementAdviceTypeCode.Termination.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementAdviceType1Code> codesByName = new LinkedHashMap<>();

	protected SettlementAdviceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AMND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementAdviceType1Code";
				definition = "Specifies the type of settlement advice.";
				trace_lazy = () -> SettlementAdviceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementAdviceType1Code.UndertakingAmendment, com.tools20022.repository.codeset.SettlementAdviceType1Code.AutomaticChargesBooking,
						com.tools20022.repository.codeset.SettlementAdviceType1Code.PaymentClaim, com.tools20022.repository.codeset.SettlementAdviceType1Code.CorrespondentBankCharges,
						com.tools20022.repository.codeset.SettlementAdviceType1Code.UndertakingIssuance, com.tools20022.repository.codeset.SettlementAdviceType1Code.ManualChargesBooking,
						com.tools20022.repository.codeset.SettlementAdviceType1Code.Refund, com.tools20022.repository.codeset.SettlementAdviceType1Code.Termination);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UndertakingAmendment.getCodeName().get(), UndertakingAmendment);
		codesByName.put(AutomaticChargesBooking.getCodeName().get(), AutomaticChargesBooking);
		codesByName.put(PaymentClaim.getCodeName().get(), PaymentClaim);
		codesByName.put(CorrespondentBankCharges.getCodeName().get(), CorrespondentBankCharges);
		codesByName.put(UndertakingIssuance.getCodeName().get(), UndertakingIssuance);
		codesByName.put(ManualChargesBooking.getCodeName().get(), ManualChargesBooking);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(Termination.getCodeName().get(), Termination);
	}

	public static SettlementAdviceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementAdviceType1Code[] values() {
		SettlementAdviceType1Code[] values = new SettlementAdviceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementAdviceType1Code> {
		@Override
		public SettlementAdviceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementAdviceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}