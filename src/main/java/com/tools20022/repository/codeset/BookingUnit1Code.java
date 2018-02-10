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
import com.tools20022.repository.codeset.BookingUnit1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Description of the method used to book single or grouped executions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingUnit1Code#EachPartial
 * BookingUnit1Code.EachPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingUnit1Code#AggregatePartial
 * BookingUnit1Code.AggregatePartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingUnit1Code#AggregateExecutions
 * BookingUnit1Code.AggregateExecutions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode
 * BookingUnitCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EACP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BookingUnit1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Description of the method used to book single or grouped executions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BookingUnit1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingUnit1Code
	 * BookingUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EachPartial"</li>
	 * </ul>
	 */
	public static final BookingUnit1Code EachPartial = new BookingUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EachPartial";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingUnit1Code.mmObject();
			codeName = BookingUnitCode.EachPartial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingUnit1Code
	 * BookingUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatePartial"</li>
	 * </ul>
	 */
	public static final BookingUnit1Code AggregatePartial = new BookingUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatePartial";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingUnit1Code.mmObject();
			codeName = BookingUnitCode.AggregatePartial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingUnit1Code
	 * BookingUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateExecutions"</li>
	 * </ul>
	 */
	public static final BookingUnit1Code AggregateExecutions = new BookingUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateExecutions";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingUnit1Code.mmObject();
			codeName = BookingUnitCode.AggregateExecutions.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BookingUnit1Code> codesByName = new LinkedHashMap<>();

	protected BookingUnit1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EACP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BookingUnit1Code";
				definition = "Description of the method used to book single or grouped executions.";
				trace_lazy = () -> BookingUnitCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BookingUnit1Code.EachPartial, com.tools20022.repository.codeset.BookingUnit1Code.AggregatePartial,
						com.tools20022.repository.codeset.BookingUnit1Code.AggregateExecutions);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EachPartial.getCodeName().get(), EachPartial);
		codesByName.put(AggregatePartial.getCodeName().get(), AggregatePartial);
		codesByName.put(AggregateExecutions.getCodeName().get(), AggregateExecutions);
	}

	public static BookingUnit1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BookingUnit1Code[] values() {
		BookingUnit1Code[] values = new BookingUnit1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BookingUnit1Code> {
		@Override
		public BookingUnit1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BookingUnit1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}