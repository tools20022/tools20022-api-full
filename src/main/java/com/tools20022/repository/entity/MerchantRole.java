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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Min3Max4Text;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party performing the card payment transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MerchantRole" src="doc-files/MerchantRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MerchantRole#MerchantCategoryCode
 * MerchantRole.MerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MerchantRole#MerchantIdentification
 * MerchantRole.MerchantIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment13#Merchant
 * CardPaymentEnvironment13.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#Merchant
 * CardPaymentEnvironment14.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#Merchant
 * CardPaymentEnvironment9.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#Merchant
 * CardPaymentEnvironment12.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#Merchant
 * CardPaymentEnvironment10.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#Merchant
 * CardPaymentEnvironment18.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#Merchant
 * CardPaymentEnvironment24.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Merchant
 * CardPaymentEnvironment20.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#Merchant
 * CardPaymentEnvironment27.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment26#Merchant
 * CardPaymentEnvironment26.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#Merchant
 * CardPaymentEnvironment23.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#Merchant
 * CardPaymentEnvironment22.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Merchant
 * CardPaymentEnvironment32.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#Merchant
 * CardPaymentEnvironment36.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#Merchant
 * CardPaymentEnvironment40.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Merchant
 * CardPaymentEnvironment34.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#Merchant
 * CardPaymentEnvironment35.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment39#Merchant
 * CardPaymentEnvironment39.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#Merchant
 * CardPaymentEnvironment52.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#Merchant
 * CardPaymentEnvironment49.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment51#Merchant
 * CardPaymentEnvironment51.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#Merchant
 * CardPaymentEnvironment48.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Merchant
 * CardPaymentEnvironment45.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#MerchantIdentification
 * CardPaymentEnvironment54.MerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Merchant
 * CardPaymentEnvironment53.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Merchant
 * CardPaymentEnvironment47.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#Merchant
 * CardPaymentEnvironment61.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Merchant
 * CardPaymentEnvironment60.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#MerchantIdentification
 * CardPaymentEnvironment66.MerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#Merchant
 * CardPaymentEnvironment62.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#Merchant
 * CardPaymentEnvironment58.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#Merchant
 * CardPaymentEnvironment59.Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#Merchant
 * CardPaymentEnvironment57.Merchant}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
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
 * "MerchantRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party performing the card payment transaction."</li>
 * </ul>
 */
public class MerchantRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Category code conform to ISO 18245, related to the type of services or
	 * goods the merchant provides for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min3Max4Text Min3Max4Text}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#MerchantCategoryCode
	 * CardPaymentTransactionDetails8.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#MerchantCategoryCode
	 * CommonData1.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#MerchantCategoryCode
	 * CardPaymentTransaction4.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#MerchantCategoryCode
	 * CommonData2.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#MerchantCategoryCode
	 * CardPaymentTransaction14.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#MerchantCategoryCode
	 * CardPaymentTransaction7.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#MerchantCategoryCode
	 * CardPaymentTransaction16.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#MerchantCategoryCode
	 * CardPaymentTransaction20.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#MerchantCategoryCode
	 * CardPaymentTransaction1.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#MerchantCategoryCode
	 * CardPaymentTransaction11.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#MerchantCategoryCode
	 * CardPaymentTransaction19.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#MerchantCategoryCode
	 * CardPaymentTransaction5.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#MerchantCategoryCode
	 * CardPaymentTransaction15.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#MerchantCategoryCode
	 * CardPaymentTransaction3.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#MerchantCategoryCode
	 * CardPaymentTransaction13.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#MerchantCategoryCode
	 * CardPaymentTransaction28.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#MerchantCategoryCode
	 * CardPaymentTransaction22.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#MerchantCategoryCode
	 * CardPaymentTransaction34.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#MerchantCategoryCode
	 * CardPaymentTransaction31.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#MerchantCategoryCode
	 * CommonData3.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#MerchantCategoryCode
	 * CardPaymentTransaction29.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#MerchantCategoryCode
	 * CardPaymentTransaction25.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#MerchantCategoryCode
	 * CardPaymentTransaction30.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#MerchantCategoryCode
	 * CardPaymentTransaction26.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#MerchantCategoryCode
	 * CardPaymentTransaction36.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#MerchantCategoryCode
	 * CardPaymentTransaction44.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#MerchantCategoryCode
	 * CardPaymentTransaction45.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#MerchantCategoryCode
	 * CardPaymentTransaction49.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#MerchantCategoryCode
	 * CardPaymentTransaction47.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#MerchantCategoryCode
	 * CardPaymentTransaction41.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#MerchantCategoryCode
	 * CommonData4.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#MerchantCategoryCode
	 * CardPaymentTransaction46.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#MerchantCategoryCode
	 * CardPaymentTransaction40.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#MerchantCategoryCode
	 * CardTransaction5.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#MerchantCategoryCode
	 * CardTransaction15.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#MerchantCategoryCode
	 * CardPaymentTransaction60.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#MerchantCategoryCode
	 * CardPaymentTransaction61.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#MerchantCategoryCode
	 * CardPaymentTransaction64.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#MerchantCategoryCode
	 * CardPaymentTransaction59.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#MerchantCategoryCode
	 * CardPaymentTransaction56.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#MerchantCategoryCode
	 * CardPaymentTransaction51.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#MerchantCategoryCode
	 * CommonData5.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#MerchantCategoryCode
	 * CardPaymentTransaction55.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#MerchantCategoryCode
	 * CardPaymentTransaction62.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#MerchantCategoryCode
	 * CardPaymentTransaction71.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#MerchantCategoryCode
	 * CardPaymentTransaction75.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#MerchantCategoryCode
	 * CardPaymentTransaction74.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#MerchantCategoryCode
	 * CardPaymentTransaction70.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#MerchantCategoryCode
	 * CardPaymentTransaction72.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#MerchantCategoryCode
	 * CardPaymentTransaction76.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#MerchantCategoryCode
	 * CommonData6.MerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#MerchantCategoryCode
	 * CardPaymentTransaction69.MerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantCategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MerchantCategoryCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionDetails8.MerchantCategoryCode, com.tools20022.repository.msg.CommonData1.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction4.MerchantCategoryCode, com.tools20022.repository.msg.CommonData2.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction14.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction7.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction16.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction20.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction1.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction11.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction19.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction5.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction15.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction3.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction13.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction28.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction22.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction34.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction31.MerchantCategoryCode, com.tools20022.repository.msg.CommonData3.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction29.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction25.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction30.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction26.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction36.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction44.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction45.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction49.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction47.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction41.MerchantCategoryCode, com.tools20022.repository.msg.CommonData4.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction46.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction40.MerchantCategoryCode,
					com.tools20022.repository.msg.CardTransaction5.MerchantCategoryCode, com.tools20022.repository.msg.CardTransaction15.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction60.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction61.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction64.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction59.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction56.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction51.MerchantCategoryCode, com.tools20022.repository.msg.CommonData5.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction55.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction62.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction71.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction75.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction74.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction70.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction72.MerchantCategoryCode,
					com.tools20022.repository.msg.CardPaymentTransaction76.MerchantCategoryCode, com.tools20022.repository.msg.CommonData6.MerchantCategoryCode, com.tools20022.repository.msg.CardPaymentTransaction69.MerchantCategoryCode);
			elementContext_lazy = () -> MerchantRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}
	};
	/**
	 * Number that identifies the merchant to the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number that identifies the merchant to the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MerchantIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MerchantRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantIdentification";
			definition = "Number that identifies the merchant to the card issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MerchantRole";
				definition = "Party performing the card payment transaction.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment13.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment14.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment9.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment12.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment10.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment18.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment24.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment20.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment27.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment26.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment23.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment22.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment32.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment36.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment40.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment34.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment35.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment39.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment52.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment49.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment51.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment48.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment45.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment54.MerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment53.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment47.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment61.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment60.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment66.MerchantIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment62.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment58.Merchant, com.tools20022.repository.msg.CardPaymentEnvironment59.Merchant,
						com.tools20022.repository.msg.CardPaymentEnvironment57.Merchant);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MerchantRole.MerchantCategoryCode, com.tools20022.repository.entity.MerchantRole.MerchantIdentification);
			}
		});
		return mmObject_lazy.get();
	}
}