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
import com.tools20022.repository.codeset.GoodTillBookingInstruction1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * States whether executions are booked out or accumulated on a partially filled
 * good till order on the day of execution or to accumulate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstruction1Code#BookOnExecutionDay
 * GoodTillBookingInstruction1Code.BookOnExecutionDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstruction1Code#AccumulateTillEnd
 * GoodTillBookingInstruction1Code.AccumulateTillEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstruction1Code#AccumulateTillTold
 * GoodTillBookingInstruction1Code.AccumulateTillTold}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
 * GoodTillBookingInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BOEX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GoodTillBookingInstruction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "States whether executions are booked out or accumulated on a partially filled good till order on the day of execution or to accumulate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GoodTillBookingInstruction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstruction1Code
	 * GoodTillBookingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookOnExecutionDay"</li>
	 * </ul>
	 */
	public static final GoodTillBookingInstruction1Code BookOnExecutionDay = new GoodTillBookingInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookOnExecutionDay";
			owner_lazy = () -> com.tools20022.repository.codeset.GoodTillBookingInstruction1Code.mmObject();
			codeName = GoodTillBookingInstructionCode.BookOnExecutionDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstruction1Code
	 * GoodTillBookingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulateTillEnd"</li>
	 * </ul>
	 */
	public static final GoodTillBookingInstruction1Code AccumulateTillEnd = new GoodTillBookingInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillEnd";
			owner_lazy = () -> com.tools20022.repository.codeset.GoodTillBookingInstruction1Code.mmObject();
			codeName = GoodTillBookingInstructionCode.AccumulateTillEnd.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstruction1Code
	 * GoodTillBookingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulateTillTold"</li>
	 * </ul>
	 */
	public static final GoodTillBookingInstruction1Code AccumulateTillTold = new GoodTillBookingInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillTold";
			owner_lazy = () -> com.tools20022.repository.codeset.GoodTillBookingInstruction1Code.mmObject();
			codeName = GoodTillBookingInstructionCode.AccumulateTillTold.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GoodTillBookingInstruction1Code> codesByName = new LinkedHashMap<>();

	protected GoodTillBookingInstruction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BOEX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GoodTillBookingInstruction1Code";
				definition = "States whether executions are booked out or accumulated on a partially filled good till order on the day of execution or to accumulate.";
				trace_lazy = () -> GoodTillBookingInstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GoodTillBookingInstruction1Code.BookOnExecutionDay, com.tools20022.repository.codeset.GoodTillBookingInstruction1Code.AccumulateTillEnd,
						com.tools20022.repository.codeset.GoodTillBookingInstruction1Code.AccumulateTillTold);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BookOnExecutionDay.getCodeName().get(), BookOnExecutionDay);
		codesByName.put(AccumulateTillEnd.getCodeName().get(), AccumulateTillEnd);
		codesByName.put(AccumulateTillTold.getCodeName().get(), AccumulateTillTold);
	}

	public static GoodTillBookingInstruction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GoodTillBookingInstruction1Code[] values() {
		GoodTillBookingInstruction1Code[] values = new GoodTillBookingInstruction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GoodTillBookingInstruction1Code> {
		@Override
		public GoodTillBookingInstruction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GoodTillBookingInstruction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}