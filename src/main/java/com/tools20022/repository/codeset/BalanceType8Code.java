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
import com.tools20022.repository.codeset.BalanceType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the balance, eg, opening balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#OpeningBooked
 * BalanceType8Code.OpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InterimBooked
 * BalanceType8Code.InterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#ClosingBooked
 * BalanceType8Code.ClosingBooked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType8Code#Expected
 * BalanceType8Code.Expected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#OpeningAvailable
 * BalanceType8Code.OpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InterimAvailable
 * BalanceType8Code.InterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#ClosingAvailable
 * BalanceType8Code.ClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#ForwardAvailable
 * BalanceType8Code.ForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#PreviouslyClosedBooked
 * BalanceType8Code.PreviouslyClosedBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentOpeningAvailable
 * BalanceType8Code.InvestmentOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentInterimAvailable
 * BalanceType8Code.InvestmentInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentClosingAvailable
 * BalanceType8Code.InvestmentClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentForwardAvailable
 * BalanceType8Code.InvestmentForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentClosingBooked
 * BalanceType8Code.InvestmentClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentInterimBooked
 * BalanceType8Code.InvestmentInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentOpeningBooked
 * BalanceType8Code.InvestmentOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#InvestmentExpected
 * BalanceType8Code.InvestmentExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementOpeningAvailable
 * BalanceType8Code.DisbursementOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementInterimAvailable
 * BalanceType8Code.DisbursementInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementClosingAvailable
 * BalanceType8Code.DisbursementClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementForwardAvailable
 * BalanceType8Code.DisbursementForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementClosingBooked
 * BalanceType8Code.DisbursementClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementInterimBooked
 * BalanceType8Code.DisbursementInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementOpeningBooked
 * BalanceType8Code.DisbursementOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#DisbursementExpected
 * BalanceType8Code.DisbursementExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionOpeningAvailable
 * BalanceType8Code.CollectionOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionInterimAvailable
 * BalanceType8Code.CollectionInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionClosingAvailable
 * BalanceType8Code.CollectionClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionForwardAvailable
 * BalanceType8Code.CollectionForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionClosingBooked
 * BalanceType8Code.CollectionClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionInterimBooked
 * BalanceType8Code.CollectionInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionOpeningBooked
 * BalanceType8Code.CollectionOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code#CollectionExpected
 * BalanceType8Code.CollectionExpected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
 * BalanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the balance, eg, opening balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code OpeningBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.OpeningBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InterimBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InterimBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code ClosingBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.ClosingBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expected"</li>
	 * </ul>
	 */
	public static final BalanceType8Code Expected = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.Expected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code OpeningAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.OpeningAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InterimAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InterimAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code ClosingAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.ClosingAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code ForwardAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.ForwardAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyClosedBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code PreviouslyClosedBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyClosedBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.PreviouslyClosedBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentOpeningAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentOpeningAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentOpeningAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentInterimAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentInterimAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentInterimAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentClosingAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentClosingAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentClosingAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentForwardAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentForwardAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentForwardAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentForwardAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentClosingBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentClosingBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentClosingBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentInterimBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentInterimBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentInterimBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentOpeningBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentOpeningBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentOpeningBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentExpected"</li>
	 * </ul>
	 */
	public static final BalanceType8Code InvestmentExpected = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentExpected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.InvestmentExpected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementOpeningAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementOpeningAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementOpeningAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementInterimAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementInterimAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementInterimAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementClosingAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementClosingAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementClosingAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementForwardAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementForwardAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementForwardAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementForwardAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementClosingBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementClosingBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementClosingBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementInterimBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementInterimBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementInterimBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementOpeningBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementOpeningBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementOpeningBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementExpected"</li>
	 * </ul>
	 */
	public static final BalanceType8Code DisbursementExpected = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisbursementExpected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.DisbursementExpected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionOpeningAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionOpeningAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionOpeningAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionInterimAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionInterimAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionInterimAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionClosingAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionClosingAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionClosingAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionForwardAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionForwardAvailable = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionForwardAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionForwardAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionClosingBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionClosingBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionClosingBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionInterimBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionInterimBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionInterimBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningBooked"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionOpeningBooked = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionOpeningBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionOpeningBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType8Code
	 * BalanceType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionExpected"</li>
	 * </ul>
	 */
	public static final BalanceType8Code CollectionExpected = new BalanceType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionExpected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType8Code.mmObject();
			codeName = BalanceTypeCode.CollectionExpected.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BalanceType8Code> codesByName = new LinkedHashMap<>();

	protected BalanceType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPBD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceType8Code";
				definition = "Specifies the nature of the balance, eg, opening balance.";
				trace_lazy = () -> BalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceType8Code.OpeningBooked, com.tools20022.repository.codeset.BalanceType8Code.InterimBooked,
						com.tools20022.repository.codeset.BalanceType8Code.ClosingBooked, com.tools20022.repository.codeset.BalanceType8Code.Expected, com.tools20022.repository.codeset.BalanceType8Code.OpeningAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.InterimAvailable, com.tools20022.repository.codeset.BalanceType8Code.ClosingAvailable, com.tools20022.repository.codeset.BalanceType8Code.ForwardAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.PreviouslyClosedBooked, com.tools20022.repository.codeset.BalanceType8Code.InvestmentOpeningAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.InvestmentInterimAvailable, com.tools20022.repository.codeset.BalanceType8Code.InvestmentClosingAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.InvestmentForwardAvailable, com.tools20022.repository.codeset.BalanceType8Code.InvestmentClosingBooked,
						com.tools20022.repository.codeset.BalanceType8Code.InvestmentInterimBooked, com.tools20022.repository.codeset.BalanceType8Code.InvestmentOpeningBooked,
						com.tools20022.repository.codeset.BalanceType8Code.InvestmentExpected, com.tools20022.repository.codeset.BalanceType8Code.DisbursementOpeningAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.DisbursementInterimAvailable, com.tools20022.repository.codeset.BalanceType8Code.DisbursementClosingAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.DisbursementForwardAvailable, com.tools20022.repository.codeset.BalanceType8Code.DisbursementClosingBooked,
						com.tools20022.repository.codeset.BalanceType8Code.DisbursementInterimBooked, com.tools20022.repository.codeset.BalanceType8Code.DisbursementOpeningBooked,
						com.tools20022.repository.codeset.BalanceType8Code.DisbursementExpected, com.tools20022.repository.codeset.BalanceType8Code.CollectionOpeningAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.CollectionInterimAvailable, com.tools20022.repository.codeset.BalanceType8Code.CollectionClosingAvailable,
						com.tools20022.repository.codeset.BalanceType8Code.CollectionForwardAvailable, com.tools20022.repository.codeset.BalanceType8Code.CollectionClosingBooked,
						com.tools20022.repository.codeset.BalanceType8Code.CollectionInterimBooked, com.tools20022.repository.codeset.BalanceType8Code.CollectionOpeningBooked,
						com.tools20022.repository.codeset.BalanceType8Code.CollectionExpected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OpeningBooked.getCodeName().get(), OpeningBooked);
		codesByName.put(InterimBooked.getCodeName().get(), InterimBooked);
		codesByName.put(ClosingBooked.getCodeName().get(), ClosingBooked);
		codesByName.put(Expected.getCodeName().get(), Expected);
		codesByName.put(OpeningAvailable.getCodeName().get(), OpeningAvailable);
		codesByName.put(InterimAvailable.getCodeName().get(), InterimAvailable);
		codesByName.put(ClosingAvailable.getCodeName().get(), ClosingAvailable);
		codesByName.put(ForwardAvailable.getCodeName().get(), ForwardAvailable);
		codesByName.put(PreviouslyClosedBooked.getCodeName().get(), PreviouslyClosedBooked);
		codesByName.put(InvestmentOpeningAvailable.getCodeName().get(), InvestmentOpeningAvailable);
		codesByName.put(InvestmentInterimAvailable.getCodeName().get(), InvestmentInterimAvailable);
		codesByName.put(InvestmentClosingAvailable.getCodeName().get(), InvestmentClosingAvailable);
		codesByName.put(InvestmentForwardAvailable.getCodeName().get(), InvestmentForwardAvailable);
		codesByName.put(InvestmentClosingBooked.getCodeName().get(), InvestmentClosingBooked);
		codesByName.put(InvestmentInterimBooked.getCodeName().get(), InvestmentInterimBooked);
		codesByName.put(InvestmentOpeningBooked.getCodeName().get(), InvestmentOpeningBooked);
		codesByName.put(InvestmentExpected.getCodeName().get(), InvestmentExpected);
		codesByName.put(DisbursementOpeningAvailable.getCodeName().get(), DisbursementOpeningAvailable);
		codesByName.put(DisbursementInterimAvailable.getCodeName().get(), DisbursementInterimAvailable);
		codesByName.put(DisbursementClosingAvailable.getCodeName().get(), DisbursementClosingAvailable);
		codesByName.put(DisbursementForwardAvailable.getCodeName().get(), DisbursementForwardAvailable);
		codesByName.put(DisbursementClosingBooked.getCodeName().get(), DisbursementClosingBooked);
		codesByName.put(DisbursementInterimBooked.getCodeName().get(), DisbursementInterimBooked);
		codesByName.put(DisbursementOpeningBooked.getCodeName().get(), DisbursementOpeningBooked);
		codesByName.put(DisbursementExpected.getCodeName().get(), DisbursementExpected);
		codesByName.put(CollectionOpeningAvailable.getCodeName().get(), CollectionOpeningAvailable);
		codesByName.put(CollectionInterimAvailable.getCodeName().get(), CollectionInterimAvailable);
		codesByName.put(CollectionClosingAvailable.getCodeName().get(), CollectionClosingAvailable);
		codesByName.put(CollectionForwardAvailable.getCodeName().get(), CollectionForwardAvailable);
		codesByName.put(CollectionClosingBooked.getCodeName().get(), CollectionClosingBooked);
		codesByName.put(CollectionInterimBooked.getCodeName().get(), CollectionInterimBooked);
		codesByName.put(CollectionOpeningBooked.getCodeName().get(), CollectionOpeningBooked);
		codesByName.put(CollectionExpected.getCodeName().get(), CollectionExpected);
	}

	public static BalanceType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceType8Code[] values() {
		BalanceType8Code[] values = new BalanceType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceType8Code> {
		@Override
		public BalanceType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}