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
import com.tools20022.repository.codeset.ReservationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the precise type of reservation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code#CashReservation
 * ReservationType1Code.CashReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code#UrgentPaymentReservation
 * ReservationType1Code.UrgentPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code#NetSSSReservation
 * ReservationType1Code.NetSSSReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code#HighlyUrgentPaymentReservation
 * ReservationType1Code.HighlyUrgentPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code#ThresholdForInvestment
 * ReservationType1Code.ThresholdForInvestment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
 * ReservationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CARE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the precise type of reservation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReservationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code
	 * ReservationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservation"</li>
	 * </ul>
	 */
	public static final ReservationType1Code CashReservation = new ReservationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservation";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationType1Code.mmObject();
			codeName = ReservationTypeCode.CashReservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code
	 * ReservationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgentPaymentReservation"</li>
	 * </ul>
	 */
	public static final ReservationType1Code UrgentPaymentReservation = new ReservationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgentPaymentReservation";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationType1Code.mmObject();
			codeName = ReservationTypeCode.UrgentPaymentReservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code
	 * ReservationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSSSReservation"</li>
	 * </ul>
	 */
	public static final ReservationType1Code NetSSSReservation = new ReservationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservation";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationType1Code.mmObject();
			codeName = ReservationTypeCode.NetSSSReservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code
	 * ReservationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighlyUrgentPaymentReservation"</li>
	 * </ul>
	 */
	public static final ReservationType1Code HighlyUrgentPaymentReservation = new ReservationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlyUrgentPaymentReservation";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationType1Code.mmObject();
			codeName = ReservationTypeCode.HighlyUrgentPaymentReservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationType1Code
	 * ReservationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdForInvestment"</li>
	 * </ul>
	 */
	public static final ReservationType1Code ThresholdForInvestment = new ReservationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdForInvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.ReservationType1Code.mmObject();
			codeName = ReservationTypeCode.ThresholdForInvestment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReservationType1Code> codesByName = new LinkedHashMap<>();

	protected ReservationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CARE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReservationType1Code";
				definition = "Specifies the precise type of reservation.";
				trace_lazy = () -> ReservationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReservationType1Code.CashReservation, com.tools20022.repository.codeset.ReservationType1Code.UrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationType1Code.NetSSSReservation, com.tools20022.repository.codeset.ReservationType1Code.HighlyUrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationType1Code.ThresholdForInvestment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashReservation.getCodeName().get(), CashReservation);
		codesByName.put(UrgentPaymentReservation.getCodeName().get(), UrgentPaymentReservation);
		codesByName.put(NetSSSReservation.getCodeName().get(), NetSSSReservation);
		codesByName.put(HighlyUrgentPaymentReservation.getCodeName().get(), HighlyUrgentPaymentReservation);
		codesByName.put(ThresholdForInvestment.getCodeName().get(), ThresholdForInvestment);
	}

	public static ReservationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReservationType1Code[] values() {
		ReservationType1Code[] values = new ReservationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReservationType1Code> {
		@Override
		public ReservationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReservationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}